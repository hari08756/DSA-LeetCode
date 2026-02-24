class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int maxProd = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;  // Save before update
            currMax = Math.max(Math.max(nums[i], currMax * nums[i]), currMin * nums[i]);
            currMin = Math.min(Math.min(nums[i], temp * nums[i]), currMin * nums[i]);
            maxProd = Math.max(maxProd, currMax);
        }
        return maxProd;
    }
}
