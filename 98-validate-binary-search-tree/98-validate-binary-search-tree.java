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
    // Brute Force - Store elements of tree in array and check if array is sorted as BST inorder 
    // gives sorted array
    public boolean isValidBST(TreeNode root) {
        
        
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    private boolean helper(TreeNode root,Long min,Long max) {
        if(root ==null) {
            return true;
        }
        
        if((root.val>(Long.valueOf(min)) && root.val<Long.valueOf(max))) {
            return helper(root.left,min,Long.valueOf(root.val)) &&                                                  helper(root.right,Long.valueOf(root.val),max);
        }
        
        return false;
        
    }
}