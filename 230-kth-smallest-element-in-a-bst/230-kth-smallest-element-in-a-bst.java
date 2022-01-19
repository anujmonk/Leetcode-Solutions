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
    
    public int kthSmallest(TreeNode root, int k) {
        Queue<Integer> queue = new PriorityQueue<>((a,b) -> (b-a));
        
        helper(root,k,queue);
        int ans = queue.peek();
        return ans;
    }
    
    private void helper(TreeNode root,int k ,Queue<Integer> queue) {
        
        if(root == null) {
            return ;
        }
        helper(root.left,k,queue);
        if(queue.size()==k) {
            return;
        }
        queue.add(root.val);
        
        helper(root.right,k,queue);
    }
}