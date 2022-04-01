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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth ==1) {
            TreeNode d = new TreeNode(val);
            d.left=root;
            return d;
        }
        
        int d = 2;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(d!=depth) {
            d++;
            int size = q.size();
            for(int i=0;i<size;i++){
            TreeNode curr = q.remove();
            if(curr.left!=null) {
                q.add(curr.left);
            }
            if(curr.right!=null) {
                q.add(curr.right);
            }
            }
        }
        for(TreeNode node: q) {
            TreeNode one = new TreeNode(val);
            TreeNode two = new TreeNode(val);
            one.left=node.left;
            two.right=node.right;
            node.left = one;
            node.right = two;
        }
        return root;
    }
}