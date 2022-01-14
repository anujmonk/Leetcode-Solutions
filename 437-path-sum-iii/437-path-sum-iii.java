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
    
    private int count=0;
    
    public int pathSum(TreeNode root, int targetSum) {
        
        TreeNode curr = root;
        List<Integer> list = new ArrayList<>();
        helper(curr,list,targetSum);
        
        return count;
    }
    
    private void helper(TreeNode curr,List<Integer> list,int target) {
        
        if(curr== null) {
            return;
        }
        
        list.add(curr.val);
        helper(curr.left,list,target);
        helper(curr.right,list,target);
        
        int sum=0;
        for(int i=list.size()-1;i>=0;i--) {
            sum+=list.get(i);
            if(sum==target) {
                count++;
            }
        }
        list.remove(list.size()-1);
    }
}