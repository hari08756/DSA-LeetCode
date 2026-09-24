class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int n = nums.length;
        int minWindSize = n + 1;
        for(int right = 0; right < n; right++){
            sum += nums[right];
            while(sum >= target){
                minWindSize = Math.min(minWindSize, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minWindSize != n + 1 ? minWindSize : 0;
    }
}