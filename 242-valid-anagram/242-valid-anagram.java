class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) {
            return false;
        }
        
        int[] sArr = new int[26];
        int[] tArr = new int[26];
        
        for(int i=0;i<s.length();i++) {
            int sIdx = (int)s.charAt(i)%97;
            int tIdx = (int)t.charAt(i)%97;
            sArr[sIdx]++;
            tArr[tIdx]++;
        }
        
        for(int i=0;i<26;i++) {
            if(sArr[i]!=tArr[i]) {
                return false;
            }
        }
        return true;
        
    }
}