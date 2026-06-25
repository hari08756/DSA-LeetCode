class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            int count = 0;
            for(int j = i; j<nums.length; j++){
                if(target == nums[j]) count++;
                if(count * 2 > j - i +1) max++;
            
            }
        }
        return max;
    }
}