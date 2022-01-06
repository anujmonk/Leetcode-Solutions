class Solution {
    
    // Since a word has to be replaced by a prefix, we can use Trie
    
    class Trie {
        
        private char value;
        private Map<Character,Trie> children;
        private boolean isEndOfWord;
        
        public Trie(char c) {
            value=c;
            children = new HashMap<>();
            isEndOfWord = false;
        }
    }
    
    public String replaceWords(List<String> dictionary, String sentence) {
        
        // Initialising Trie and adding all dictionary words
        Trie root = new Trie(' ');
        Trie curr = root;
        for(String s:dictionary) {
            curr=root;
            for(char c:s.toCharArray()) {
                if(!curr.children.containsKey(c)) {
                    curr.children.put(c,new Trie(c));
                }
                curr=curr.children.get(c);
            }
            curr.isEndOfWord = true;
        }
        
        // Iterating over sentence and if a prefix is matched then substitute it
        String[] str = sentence.split(" ");
        
        for(int i=0;i<str.length;i++) {
            String word = str[i];
            StringBuilder builder = new StringBuilder();
            curr=root;
            for(char c:word.toCharArray()) {
                if(!curr.children.containsKey(c)) {
                    break;
                }
                
                builder.append(curr.children.get(c).value);
                
                if(curr.children.get(c).isEndOfWord) {
                    curr=curr.children.get(c);
                    break;
                }
                
                curr=curr.children.get(c);
            }
            if(builder.length()!=0 && curr.isEndOfWord) {
               
                str[i]= builder.toString();
            }
        }
        
        return String.join(" ",str);
    }
}