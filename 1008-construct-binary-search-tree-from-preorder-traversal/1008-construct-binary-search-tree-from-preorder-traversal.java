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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root = new TreeNode(preorder[0]);
        
        for(int i=1;i<preorder.length;i++) {
            TreeNode curr = root;
            insertIntoBST(curr,preorder[i]);
        }
        
        return root;
    }
    
    public boolean insertIntoBST(TreeNode curr, int value) {
        if(curr==null) {
            return true;
        }
        
        if(curr.val>value) {
            if(insertIntoBST(curr.left, value)) {
                curr.left=new TreeNode(value);
            }
        }
        else {
            if(insertIntoBST(curr.right, value)) {
                curr.right=new TreeNode(value);
            }
        }
        return false;
    }
}