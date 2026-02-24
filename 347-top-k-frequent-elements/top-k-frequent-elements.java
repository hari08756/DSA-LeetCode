class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Count frequencies
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Sort by frequency in descending order
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a, b) -> map.get(b) - map.get(a));
        
        // Return top k elements
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }
        return result;
    }
}