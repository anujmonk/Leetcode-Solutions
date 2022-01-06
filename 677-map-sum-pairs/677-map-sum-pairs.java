class MapSum {

    class Node {
        
        private char value;
        private Map<Character,Node> children;
        private Set<String> associatedWords;
        
        Node(char c) {
            value=c;
            children = new HashMap<>();
            associatedWords = new HashSet<>();
        }
    }
    
    private Node root;
    Map<String,Integer> wordValue; 
    public MapSum() {
        root=new Node(' ');
        wordValue= new HashMap<>();
    }
    
    public Node getRoot() {
        return root;
    }
    
    public void insert(String key, int val) {
        Node cur = getRoot();
        
        for(char c: key.toCharArray()) {
            if(!cur.children.containsKey(c)) {
                cur.children.put(c,new Node(c));
            }
            cur.associatedWords.add(key);
            cur=cur.children.get(c);
        }
        cur.associatedWords.add(key);
        wordValue.put(key,val);
    }
    
    public int sum(String prefix) {
        Node cur = getRoot();
        
        for(char c: prefix.toCharArray()) {
            if(!cur.children.containsKey(c)) {
                return 0;
            }
            cur=cur.children.get(c);
        }
        
        // if(cur.associatedWords.isEmpty()) {
        //     return 0;
        // }
        
        int ans = 0;
        for(String s:cur.associatedWords) {
            ans+=wordValue.get(s);
        }
        return ans;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */