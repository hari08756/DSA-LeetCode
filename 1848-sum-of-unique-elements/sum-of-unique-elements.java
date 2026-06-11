class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1) ans += key;
        }
        return ans;
    }
}