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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        int ans =0;
        while(!queue.isEmpty()) {
            
            int size =queue.size();
            int m = 0;
            for(int i=0;i<size;i++) {
                TreeNode curr = queue.remove();
                
                if(curr.left==null && curr.right==null) {
                    m+=curr.val;
                }
                if(curr.left!=null) {
                    queue.add(curr.left);
                }
                if(curr.right!=null) {
                    queue.add(curr.right);
                }
            }
            ans=m;
        }
        return ans;
    }
}