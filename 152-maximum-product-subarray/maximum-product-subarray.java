class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        for(int i = 1; i<nums.length; i++){
            int temp = currMax;
            currMax = Math.max(currMin * nums[i], Math.max(nums[i], currMax * nums[i]));
            currMin = Math.min(currMin * nums[i], Math.min(nums[i], temp * nums[i]));
            maxProd = Math.max(currMax, maxProd);
        }
        return maxProd;

    }
}