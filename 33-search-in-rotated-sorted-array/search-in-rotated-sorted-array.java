class Solution {
    public int search(int[] nums, int target) {
        int count =0;
        for(int num : nums){
            if(target == num) return count;
            count++;
        }
        return -1;
    }
}