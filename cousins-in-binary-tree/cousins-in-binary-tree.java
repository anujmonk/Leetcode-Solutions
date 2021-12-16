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
    public boolean isCousins(TreeNode root, int x, int y) {
        int xHeight=-1;
        int yHeight=-1;
        TreeNode xParent=null;
        TreeNode yParent=null;
        boolean cousin=false;
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int depth=1;
        while(!queue.isEmpty()) {
            int curr_size=queue.size();
            if(xHeight!=-1 && yHeight!=-1) {
                break;
            }
            while(curr_size!=0) {
                curr_size--;
                TreeNode element=queue.poll();
                
                if(element.left!=null) {
                    queue.add(element.left);
                    if(element.left.val==x) {
                    xHeight=depth;
                    xParent=element;
                    }
                    else if(element.left.val==y) {
                    yHeight=depth;
                    yParent=element;
                    }
                }
                if(element.right!=null) {
                    queue.add(element.right);
                    if(element.right.val==x) {
                    xHeight=depth;
                    xParent=element;
                    }
                    else if(element.right.val==y) {
                    yHeight=depth;
                    yParent=element;
                    }
                }
            }
            depth++;
        }

        if(xParent!=null && yParent!=null) {
            if(xHeight==yHeight) {
                if(xParent.val!=yParent.val) {
                    return true;
                }
            }
        }
        return false;
    }
}