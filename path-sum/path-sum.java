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
    private int sum=0;
    private boolean check = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        helper(root,targetSum);
        
        return check;
    }
    
    private void helper(TreeNode root, int target) {
        
        if(root==null || check) {
            return;
        }
        
        sum+=root.val;
        if(sum==target && (root.left==null && root.right==null)) {
            check = true;
        }
        
        helper(root.left,target);
        helper(root.right,target);
        
        sum-=root.val;
    }
}