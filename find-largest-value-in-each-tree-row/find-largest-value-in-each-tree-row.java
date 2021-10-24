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
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> out= new ArrayList<>();
        // root == null
        if(root==null) {
            return out;
        }
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        //out.add(root.val);
        //BFS or iterating the tree level wise
        while(!queue.isEmpty()) {
            int max=Integer.MIN_VALUE;

            int size_queue=queue.size();
            for(int i=0;i<size_queue;i++) {
                TreeNode ele=queue.poll();
                max=Math.max(max,ele.val);
                if(ele.left!=null) {
                  queue.add(ele.left);  
                }
                if(ele.right!=null) {
                  queue.add(ele.right);  
                }   
            }
            out.add(max);
        }
        return out;
    }
}