class Solution {
    public int lengthOfLastWord(String s) {
        
        int lastWord=0;
        int ans=0;
        for(int i=0;i<s.length();i++) {
            char c= s.charAt(i);
            if(c==' ') {
                if(lastWord!=0) {
                    ans=lastWord;
                    lastWord=0;
                }
                continue;
            }
            else {
                lastWord+=1;        
            }
            
        }
        if(lastWord!=0) {
            ans=lastWord;
        }
        
        return ans;
    }
}