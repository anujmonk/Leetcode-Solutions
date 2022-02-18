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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        inorder(root1,list1);
        inorder(root2,list2);
        
        
        
        return merge(list1,list2);
    }
    
    private void inorder(TreeNode root,List<Integer> list) {
        
        if(root==null) {
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    
    private List<Integer> merge(List<Integer> list1,List<Integer> list2) {
        int l=0;
        int r=0;
        
        List<Integer> out = new ArrayList<>();
        
        while(l<list1.size() && r<list2.size()) {
            if(list1.get(l) < list2.get(r)) {
                out.add(list1.get(l));
                l++;
            }
            else {
                out.add(list2.get(r));
                r++;
            }
        }
        
        while(l<list1.size()) {
            out.add(list1.get(l));
            l++;
        }
        
        while(r<list2.size()) {
            out.add(list2.get(r));
            r++;
        }
        
        return out;
    }
}