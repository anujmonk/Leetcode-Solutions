/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        
        if(node==null) {
            return null;
        }
        
        Queue<Node> queue= new LinkedList<>();
        
        Map<Node,Node> map = new HashMap<>();
        Set<Node> visit = new HashSet<>();
        queue.add(node);
        visit.add(node);
        while(!queue.isEmpty()) {
            Node curr =queue.remove();
            
            Node newCurr=null;
            if(map.containsKey(curr)) {
                newCurr = map.get(curr);
            }
            else {
                newCurr = new Node(curr.val);
                map.put(curr,newCurr);
            }
            
            for(Node neighbor:curr.neighbors) {
                if(map.containsKey(neighbor)) {
                    newCurr.neighbors.add(map.get(neighbor));
                }
                else{
                    Node newN = new Node(neighbor.val);
                    map.put(neighbor,newN);
                    newCurr.neighbors.add(newN);
                }
                if(!visit.contains(neighbor)) {
                    visit.add(neighbor);
                    queue.add(neighbor);
                }
                    
            }
        }
    
        return map.get(node);
    }
}