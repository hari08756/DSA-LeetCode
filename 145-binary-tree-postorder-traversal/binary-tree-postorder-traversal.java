class Solution {
    public void postOrderTraversal(TreeNode root, List<Integer> list){
        if(root == null) return;
        postOrderTraversal(root.left, list);
        postOrderTraversal(root.right, list);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrderTraversal(root, list);
        return list;
    }
}