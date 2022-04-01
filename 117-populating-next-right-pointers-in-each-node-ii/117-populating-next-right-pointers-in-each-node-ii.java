/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        // Can be solved by BFS
        
        if(root == null) {
            return null;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        
        while(!queue.isEmpty()) {
            
            while(true) {
                Node curr = queue.remove();
                
                if(curr == null) {
                    
                    break;
                }
                curr.next = queue.peek();
                if(curr.left!=null) {
                    queue.add(curr.left);
                }
                if(curr.right!=null) {
                    queue.add(curr.right);
                }
            }
            if(!queue.isEmpty())
                queue.add(null); 
        }
        return root;
    }
}