class Trie {
    
    class Node {
        
        private char value;
        private Map<Character,Node> children;  
        private boolean isEndOfWord;
        
        public Node(char c) {
            value = c;
            children = new HashMap<>();
            isEndOfWord = false;
        }
    }

    private Node root;
        
    public Trie() {
        root = new Node(' ');
    }
    
    public Node getRoot() {
        return root;
    }
    
    public void insert(String word) {
        
        Node curr = getRoot();
        
        for(char c:word.toCharArray()) {
            
            if(!curr.children.containsKey(c)) {
                curr.children.put(c,new Node(c));
            }
            curr=curr.children.get(c);
        }
        curr.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        
        Node curr = root;
        
        for(char c:word.toCharArray()) {
            if(!curr.children.containsKey(c)) {
                return false;
            }
            curr=curr.children.get(c);
        }
        if(curr.isEndOfWord)
            return true;
        
        return false;
    }
    
    public boolean startsWith(String prefix) {
        
        Node curr = getRoot();
        
        for(char c: prefix.toCharArray()) {
            
            if(!curr.children.containsKey(c)) {
                return false;
            }
            curr=curr.children.get(c);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */