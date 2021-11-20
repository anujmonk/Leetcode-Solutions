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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null) {
            return root2;
        }
        else if(root2==null) {
            return root1;
        }

        return helper(root1,root2);
        
    }
    private int left;
    private int right;
    
    private TreeNode helper(TreeNode root1, TreeNode root2) {
        if(root1==null && root2 == null) {
            return null;
        }
        
        if(root1!=null) {
            left=root1.val;
        }
        else{
            left=0;
        }
        
        if(root2!=null) {
            right=root2.val;
        }
        else{
            right=0;
        }
        TreeNode root=new TreeNode(left+right);
        TreeNode tempLeft1= root1==null?null:root1.left;
        TreeNode tempLeft2= root2==null?null:root2.left;
        if(!(tempLeft1==null && tempLeft2==null))
            root.left=helper(tempLeft1,tempLeft2);
        TreeNode tempRight1= root1==null?null:root1.right;
        TreeNode tempRight2= root2==null?null:root2.right;
        if(!(tempRight1==null && tempRight2==null))
            root.right=helper(tempRight1,tempRight2);
 
        return root;
    }
}