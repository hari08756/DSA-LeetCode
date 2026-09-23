class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> evenFreq = new HashMap<>();
        for(int num : nums){
            if(num % 2 == 0){
                evenFreq.put(num, evenFreq.getOrDefault(num,0) + 1);
            }
        }
        int ans = -1;
        int bestFreq = 0;

        for(Map.Entry<Integer, Integer> entry : evenFreq.entrySet()){
            int num = entry.getKey();
            int f = entry.getValue();
            if(f > bestFreq || f == bestFreq && num < ans){
                bestFreq = f;
                ans = num;
            }
        }
        return ans;
    }
}