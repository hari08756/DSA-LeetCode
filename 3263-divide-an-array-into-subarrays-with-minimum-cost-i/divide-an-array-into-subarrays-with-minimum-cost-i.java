class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        if(n==3) return nums[0]+nums[1]+nums[2];
        int f = nums[0];
        int s = Integer.MAX_VALUE, t = Integer.MAX_VALUE;
        for(int i =1; i<n; i++){
            if(nums[i]<s){
                t = s;
                s = nums[i];
            }else if(nums[i] < t){
                t = nums[i];
            }
        }
        return f+s+t;
    }
}