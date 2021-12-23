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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        if(root== null) {
            return list;
        }
        
        Stack<Integer> stack = new Stack<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        boolean reverse = false;
        while(!q.isEmpty()) {
            int size= q.size();
            List<Integer> current = new ArrayList<>();
            while(size!=0) {
                TreeNode temp = q.poll();
                if(reverse) {
                    stack.push(temp.val);
                }
                else{
                    current.add(temp.val);
                }
                
                if(temp.left!=null) {
                    q.add(temp.left);
                }
                
                if(temp.right!=null) {
                    q.add(temp.right);
                }
                size--;
            }
            if(reverse) {
                while(!stack.isEmpty()) {
                    current.add(stack.pop());
                }
            }
            list.add(current);
            reverse=!reverse;
        }
        return list;
    }
}