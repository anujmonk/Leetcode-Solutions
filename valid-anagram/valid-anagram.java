class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) {
            return false;
        }
            
        char[] lower=new char[26];
        
        for(int i=0;i<s.length();i++) {
            lower[s.charAt(i)-'a']+=1;
        }
        
        for(int i=0;i<t.length();i++) {
            lower[t.charAt(i)-'a']-=1;
        }
        
        for(int i=0;i<lower.length;i++) {
            if(lower[i]!=0) {
                return false;
            }
        }
        return true;
    }
}