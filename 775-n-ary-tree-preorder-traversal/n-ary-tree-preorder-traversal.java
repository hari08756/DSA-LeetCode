
class Solution {
    public void preOrder(Node root, List<Integer> preorders){
        if(root == null) return;
        preorders.add(root.val);
        for(Node ch : root.children)
            preOrder(ch, preorders);
    }
    public List<Integer> preorder(Node root) {
        List<Integer> preorders = new ArrayList<>();
        preOrder(root, preorders);
        return preorders;
    }
}