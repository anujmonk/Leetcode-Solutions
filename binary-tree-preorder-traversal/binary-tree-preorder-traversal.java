/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> out=new ArrayList<Integer>();
        TreeNode current=root;
        ArrayDeque<TreeNode> stack=new ArrayDeque<TreeNode>();
        if(current!=null)
            stack.push(current);
        while(stack.peek()!=null){
            current=stack.pop();
            out.add(current.val);
            if(current.right!=null)
                stack.push(current.right);
            if(current.left!=null)
                stack.push(current.left);
        }
        return out;
    }
}
