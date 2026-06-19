class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int [] num = new int[n];
        for(int i = 0; i<n; i++){
            num[i] = nums[i];
        }
        Arrays.sort(num);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = n-k; i < n; i++){
            list.add(num[i]);
        }
        int [] subArray = new int[k];
        int j = 0;
        for(int i = 0; i < n && j < k; i++){
            if(list.contains(nums[i])){
                subArray[j++] = nums[i];
                list.remove(Integer.valueOf(nums[i]));
            }
        }
        return subArray;
    }
}