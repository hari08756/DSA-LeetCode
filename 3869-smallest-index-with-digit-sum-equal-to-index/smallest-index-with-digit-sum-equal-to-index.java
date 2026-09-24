class Solution {
    public int digitSum(int num){
        int digitSums = 0;
        while(num > 0){
            digitSums += num % 10;
            num /= 10;
        }
        return digitSums;
    }
    public int smallestIndex(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            if(i == digitSum(nums[i])) return i;
        }
        return -1;
    }
}