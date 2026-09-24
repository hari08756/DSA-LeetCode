class Solution {
    
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        Map<Character, Integer> freqS1 = new HashMap<>();
        Map<Character, Integer> freqS2 = new HashMap<>();

        for(int i = 0; i<s1.length(); i++){
            freqS1.put(s1.charAt(i), freqS1.getOrDefault(s1.charAt(i), 0) + 1);
            freqS2.put(s2.charAt(i), freqS2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        int left = 0;

        for(int i = s1.length(); i < s2.length(); i++){
            if(freqS1.equals(freqS2)) return true;

            char removeChar = s2.charAt(left);
            int newFreq = freqS2.get(removeChar) - 1;

            if(newFreq == 0) freqS2.remove(removeChar);
            else
                freqS2.put(removeChar, newFreq);

            freqS2.put(s2.charAt(i), freqS2.getOrDefault(s2.charAt(i), 0) + 1);

            left++;
            
        }
        return freqS1.equals(freqS2);
    }
}