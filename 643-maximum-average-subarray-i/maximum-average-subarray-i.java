class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0.0;
        int sum = 0;
        int i = 0;
        while(i<k){
            sum += nums[i++];
        }
        ans = (double) sum / k;
        i = 0;
        for(int j = k; j<nums.length; j++, i++){
            sum += nums[j] - nums[i];
            ans = Math.max(ans, (double)sum / k);
        }
        return ans;
    }
}