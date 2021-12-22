/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    // Brute Force
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        Map<TreeNode,TreeNode> map = new HashMap<>();
        
        helper(root,null,map);
        
        TreeNode curr =p;
        Set<TreeNode> set= new HashSet<>();
        while(curr!=null) {
            set.add(curr);
            curr=map.get(curr);
        }
        
        curr = q;
        while(true) {
            
            if(set.contains(curr)) {
                break;
            }
            curr=map.get(curr);
        }
        return curr;
    }
    
    
    private void helper(TreeNode root,TreeNode parent,Map<TreeNode,TreeNode> map) {
        
        if(root==null) {
            return;
        }
        
        map.put(root,parent);
        
        helper(root.left,root,map);
        helper(root.right,root,map);
        
    }
}