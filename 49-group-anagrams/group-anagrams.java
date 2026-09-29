class Solution {
    private boolean match(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        char [] a1 = s1.toCharArray();
        Arrays.sort(a1);
        char [] a2 = s2.toCharArray();
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        int n = strs.length;
        boolean [] seen = new boolean [n];
        for(int i = 0; i<n; i++){
            List<String> curr = new ArrayList<>();
            if(seen[i]) continue;
            curr.add(strs[i]);
            for(int j = i+1; j <n; j++){
                if(!seen[j] && match(strs[i], strs[j])){
                    curr.add(strs[j]);
                    seen[j] = true;
                }
            }
            anagrams.add(curr);
        }
        return anagrams;
    }
}