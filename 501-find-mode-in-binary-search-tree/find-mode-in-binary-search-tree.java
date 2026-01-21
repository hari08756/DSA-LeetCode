/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private Integer prevVal = null;
    private int currCount = 0;
    private int maxCount = 0;
    private List<Integer> modes = new ArrayList<>();
    private void dfs(TreeNode node){
        if(node == null) return;
        dfs(node.left);
        if(prevVal == null || node.val != prevVal){
            prevVal = node.val;
            currCount = 1;
        }else{
            currCount++;
        }
        if(currCount > maxCount){
            maxCount = currCount;
            modes.clear();
            modes.add(node.val);
        }else if(currCount == maxCount){
            modes.add(node.val);
        }
        dfs(node.right);
    }
    public int[] findMode(TreeNode root) {
        dfs(root);
        int [] res = new int[modes.size()];
        for(int i = 0; i<modes.size(); i++){
            res[i] = modes.get(i);
        }
        return res;
    }
}