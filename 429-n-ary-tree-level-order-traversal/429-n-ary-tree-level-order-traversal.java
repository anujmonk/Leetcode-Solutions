/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> ans= new ArrayList<>();
        if(root == null) {
            return ans;
        }
        
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> cur = new ArrayList<>();
            for(int i=0;i<size;i++) {
                Node curr = queue.remove();
                cur.add(curr.val);
                for(Node c:curr.children) {
                    queue.add(c);
                }
            }
            ans.add(cur);
        }
        return ans;
    }
}