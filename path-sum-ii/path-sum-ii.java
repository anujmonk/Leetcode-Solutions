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
    private List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<Integer> ans = new ArrayList<>();        
        
        helper(root,targetSum,ans,0,result);
        
        return result;
    }
    
    private void helper(TreeNode root, int target, List<Integer> ans, int sum, List<List<Integer>> result) {
        
        if(root ==null) {
            return;
        }
        
        
        
        
        
        sum+=root.val;
        ans.add(root.val);
        
        if(root.left==null && root.right==null && sum==target) {

            List<Integer> temp = new ArrayList<>();
            for(Integer i:ans) {
                    temp.add(i);
                 }
                result.add(temp);
            
                ans.remove(ans.size()-1);
                
            return;
        }
        
        helper(root.left,target,ans,sum,result);
        helper(root.right,target,ans,sum,result);
        
        sum-=root.val;
        ans.remove(ans.size()-1);
        
    }
    
}