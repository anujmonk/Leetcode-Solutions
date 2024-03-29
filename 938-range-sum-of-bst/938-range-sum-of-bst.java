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
    private int ans = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root,low,high);
        
        return ans;
    }
    
    private void dfs(TreeNode root,int low, int high) {
        if(root == null) {
            return ;
        }
        
        if(root.val>=low && root.val<=high) {
            ans+=root.val;
        }
        dfs(root.left,low,high);
        dfs(root.right,low,high);
    }
}