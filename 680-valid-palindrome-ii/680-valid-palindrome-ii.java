class Solution {
    public boolean validPalindrome(String s) {
        int start=0;
        int end = s.length()-1;
        
        // The only thing to watch here is which character to delete since we are unsure try both
        while(start<=end) {
            if(s.charAt(start)!=s.charAt(end)) {
                return checkPalindrome(s,start+1,end) || checkPalindrome(s,start,end-1);
            }
            else {
            start++;
            end--;
            }
        }
        
        return true;
    }
    
    private boolean checkPalindrome(String s,int start,int end) {
        if(start>end) {
            return true;
        }
        
        return s.charAt(start)==s.charAt(end) && checkPalindrome(s,start+1,end-1);
    }
}