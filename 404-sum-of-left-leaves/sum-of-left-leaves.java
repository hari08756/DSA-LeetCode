class Solution {
    public static int sum;
    public void sumofLeftLeaves(TreeNode root){
        if(root == null) return;
        if(root.left != null && root.left.left == null && root.left.right == null) sum += root.left.val;
        sumofLeftLeaves(root.left);
        sumofLeftLeaves(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        sumofLeftLeaves(root);
        return sum;
    }
}