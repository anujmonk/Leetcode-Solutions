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
    
    // Morris Traversal Withour space you are traversing the whole tree
    // The idea is to find the right most node in the left tree and then link its right 
    // to the root's right and then make right child equal to left and make left null
    public void flatten(TreeNode root) {
        if(root==null) {
            return;
        }
        
        TreeNode curr = root;
        while(curr!=null) {
            TreeNode temp = curr.left;
            if(temp!=null) {
                
                while(temp.right!=null) {
                    temp=temp.right;
                }
                temp.right=curr.right;
                curr.right=curr.left;
                curr.left=null;
            }
            curr=curr.right;
            
        }
           
    }
}