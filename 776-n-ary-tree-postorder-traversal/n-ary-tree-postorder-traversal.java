
class Solution {
    public void preOrder(Node root, List<Integer> postorders){
        if(root == null) return;
        
        for(Node ch : root.children)
            preOrder(ch, postorders);
        postorders.add(root.val);    
    }
    public List<Integer> postorder(Node root) {
        List<Integer> postorders = new ArrayList<>();
        preOrder(root, postorders);
        return postorders;
    }
}