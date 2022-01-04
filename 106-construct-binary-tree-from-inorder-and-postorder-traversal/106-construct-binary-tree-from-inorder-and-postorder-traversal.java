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
    private int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index=postorder.length-1;
        return helper(inorder,postorder,0,postorder.length-1);
    }
    
    private TreeNode helper(int[] inorder,int[] postorder,int low,int high) {
        
        if(low>high || low<0 || high>= postorder.length) {
            return null;
        }
        
        int found=0;
        for(int i=0;i<postorder.length;i++) {
            if(postorder[index]==inorder[i]) {
                found=i;
                index--;
                break;
            }
        }
        TreeNode root = new TreeNode(inorder[found]);
        root.right= helper(inorder,postorder,found+1,high);
        root.left= helper(inorder,postorder,low,found-1);
        
        return root;
    }
}