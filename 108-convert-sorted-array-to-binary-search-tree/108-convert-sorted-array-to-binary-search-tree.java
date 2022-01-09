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

    public TreeNode sortedArrayToBST(int[] nums) {
        
        return addToBST(0,nums.length-1,nums);
        
    }
    
    private TreeNode addToBST(int low,int high,int nums[]) {
        if(low>high ) {
            return null;
        }
        
        int mid = low+(high-low)/2;
        
        TreeNode root = new TreeNode(nums[mid]);
    
        root.left=addToBST(low,mid-1,nums);
        root.right=addToBST(mid+1,high,nums);
        
        return root;
    }
}