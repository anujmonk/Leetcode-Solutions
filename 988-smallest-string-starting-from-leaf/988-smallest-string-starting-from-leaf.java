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
    private String ans = new String();
    public String smallestFromLeaf(TreeNode root) {
        
        StringBuffer curr = new StringBuffer();
        helper(root,curr);
        
        return ans;
    }
    
    private void helper(TreeNode root,StringBuffer curr) {
        
        curr.append((char)(97+root.val));
        
        if(root.left==null && root.right==null) {
            
            StringBuffer rev = new StringBuffer(curr);
            
            rev.reverse();
            
            if(ans.length()==0) {
                ans=new String(rev.toString());
                
                curr.deleteCharAt(curr.length()-1);
                
                return;
            } 
            else{
                ans=ans.compareTo(rev.toString())<=0?ans:rev.toString();
                curr.deleteCharAt(curr.length()-1);
                
                return;
            }
        }
        if(root.left!=null)
            helper(root.left,curr);
        if(root.right!=null)
            helper(root.right,curr);
        
        curr.deleteCharAt(curr.length()-1);
        
    }
    
}