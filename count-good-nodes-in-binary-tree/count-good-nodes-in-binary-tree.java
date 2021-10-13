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
    int count=0;
    public int goodNodes(TreeNode root) {
        if(root==null)
            return 0;
        int max=root.val;
        
        countGoodNodes(root,max);
        return count;
        
    }
    
    public void countGoodNodes(TreeNode root,int max) {
        if(root == null) {
            return ;
        }
        if(root.val>=max){
            count++;
            
            max=Math.max(root.val,max);
        }
        countGoodNodes(root.left,max);
        countGoodNodes(root.right,max);
    }
}