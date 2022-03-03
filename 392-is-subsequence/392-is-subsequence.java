class Solution {
    public boolean isSubsequence(String s, String t) {
        // Take two pointers and whenever a character matched incremenet the pointer of first string
        if(s.length()>t.length()) {
            return false;
        }
        
        int i=0,j=0;
        while(i<s.length() && j<t.length()) {
            if(s.charAt(i)==t.charAt(j)) {
                i++;
            }
            j++;
            
        }
        return (i==s.length());
        
    }
}