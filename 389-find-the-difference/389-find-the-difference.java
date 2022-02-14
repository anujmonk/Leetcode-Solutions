class Solution {
    public char findTheDifference(String s, String t) {
        int[] charSet= new int[26];
        
        for(char c: s.toCharArray()) {
            charSet[c-'a']++;
        }
        
        
        for(char c:t.toCharArray()) {
            charSet[c-'a']--;    
        }
        
        char ans=' ';
        for(int i=0;i<26;i++) {
            if(charSet[i]!=0) {
                ans=(char)(i+(int)'a');
            }
        }
        return ans;
    }
}