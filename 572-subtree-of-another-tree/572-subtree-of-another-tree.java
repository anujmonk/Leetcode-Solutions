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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        TreeNode curr = root;
        TreeNode sub_curr = subRoot;
        
        return helper(curr,sub_curr);
    }
    
    private boolean helper(TreeNode curr,TreeNode sub_curr) {
        
        if(curr == null && sub_curr == null) {
            return true;
        }
    
         if((curr == null && sub_curr != null) || (curr != null && sub_curr == null)) {
            return false;
        }
        
        if(curr.val == sub_curr.val) {
            if(helper2(curr,sub_curr)) {
                return true;
            }
        }
        
        return helper(curr.left,sub_curr) || helper(curr.right,sub_curr);
    }
    
    private boolean helper2(TreeNode p,TreeNode q) {
        if((p==null && q==null) ) {
            return true;
        }
        else if((p==null && q!=null) || (p!=null && q==null))
        {
            return false;
        }
        
        if(p.val==q.val) {
            return helper2(p.left,q.left) && helper2(p.right,q.right);
        }
        
        return false;
    }
    
}

