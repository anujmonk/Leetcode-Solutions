class Solution {
    public int lengthOfLongestSubstring(String s) {
     
        if(s==null || s.length()==0) {
            return 0;
        }
        
        int start = 0,high =1;
        int length =1;
        Set<Character> set = new HashSet<>();
        
        set.add(s.charAt(start));
        
        while(high < s.length()) {
            char st = s.charAt(start);
            char h = s.charAt(high);
            while(start<high && set.contains(h)) {
                st = s.charAt(start);
                set.remove(st);
                start++;
            }
            set.add(h);
            high++;
            length = Math.max(length,set.size());
            
        }
        
        return length;
    }
}