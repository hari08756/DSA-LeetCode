class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequentEle = new HashMap<>();
        for(int num : nums){
            frequentEle.put(num, frequentEle.getOrDefault(num, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(frequentEle.keySet());
        keys.sort((a,b) -> frequentEle.get(b) - frequentEle.get(a));
        int [] freqEle = new int[k];
        for(int i = 0; i<k; i++){
            freqEle[i] = keys.get(i);
        }
        return freqEle;
    }
}