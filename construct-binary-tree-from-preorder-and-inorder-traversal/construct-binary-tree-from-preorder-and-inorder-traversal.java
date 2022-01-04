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
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        int len = preorder.length-1;
        
        return helper(preorder,inorder,0,len);
    }
    
    private TreeNode helper(int[] preorder, int[] inorder, int low, int high) {
        
        if(low>high || low<0 || high>=preorder.length) {
            return null;
        }
        
        
        int found = 0;
        for(int i=0;i<inorder.length;i++) {
            if(inorder[i]==preorder[index]) { 
                found=i;
                break;
            }
        }
        TreeNode root=new TreeNode(preorder[index++]);
        root.left = helper(preorder,inorder,low,found-1);
        root.right = helper(preorder,inorder,found+1,high);
     
        return root;
    }
}