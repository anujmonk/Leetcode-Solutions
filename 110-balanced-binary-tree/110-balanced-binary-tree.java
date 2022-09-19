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
    boolean check = true;
    public boolean isBalanced(TreeNode root) {    
        height(root);
        
        return check;
    }
    
    public int height(TreeNode root) {
        if(root==null || !check) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if(left-right>1 || right-left>1) {
            check =false;
        }
        
        return Math.max(left,right)+1;
    }
}