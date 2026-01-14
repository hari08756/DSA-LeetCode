class Solution {
    public void minDifference(TreeNode root, ArrayList<Integer> nums){
        if(root == null) return;
        nums.add(root.val);
        minDifference(root.left, nums);
        minDifference(root.right, nums);
    }
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> nums = new ArrayList<>();
        minDifference(root, nums);
        Collections.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1; i < nums.size(); i++)
            minDiff = Math.min(Math.abs(nums.get(i) - nums.get(i-1)), minDiff);
        return minDiff;
    }
}