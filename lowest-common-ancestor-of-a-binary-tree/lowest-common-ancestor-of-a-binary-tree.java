/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
/**
 Best solution
 
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null) {
            return null;
        }
        
        TreeNode left =lowestCommonAncestor(root.left,p,q);
        TreeNode right =lowestCommonAncestor(root.right,p,q);
        
        // If one of the value is a node then return it.
        if((root == p) || (root==q)) {
            return root;
        }
        
        // The values p and q doesnot exits in the subtree
        if((left==null) && (right==null)) {
            return null;
        }
        // The values p and q exist in the subtree
        else if((left!=null) && (right!=null)) {
            return root;
        }
        // Left subtree contains a value
        else if((left!=null) && (right==null)) {
            return left;
        }
        // Right subtree contains a value
        else if((left==null) && (right!=null)) {
            return right;
        }
        
        return null;
    }
}
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
