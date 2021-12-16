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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) {
            return ans;
        }
        
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        Stack<List<Integer>> stack = new Stack<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            List<Integer> out= new ArrayList<>();
            while(size!=0) {
                TreeNode current = queue.poll();
                if(current.left!=null) {
                    queue.add(current.left);
                }
                if(current.right!=null) {
                    queue.add(current.right);
                }
                out.add(current.val);
                size--;
            }
            stack.push(out);
        }
        
        while(!stack.isEmpty()) {
            ans.add(stack.pop());
        }
            
        return ans;
    }
}