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
        // Use BFS to solve it but it will take O(n) space
        // Using O(1) space
        
        if(root == null) {
            return null;
        }
        
        root.next=null;
        helper(root);
        return root;
        
    }
    
    private void helper(Node root) {
        if(root==null)
            return;
        if(root.next!=null && (root.right!=null && root.next.left!=null)) {
                root.right.next=root.next.left;
        }
        
        if(root.left!=null && root.right!=null) {
            root.left.next=root.right;
        }
        helper(root.left);
        helper(root.right);
    }
}