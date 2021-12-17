class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if( s == null || s.length() == 0) {
            return 0;
        }
        
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0;
        StringBuffer buffer= new StringBuffer();
        
        for(int i=0;i<s.length();i++) {
            if(!map.containsKey(s.charAt(i))) {
                buffer.append(s.charAt(i));
                map.put(s.charAt(i),i);
            }
            else {
                if(map.get(s.charAt(i))>=i-buffer.length()) {
                
                int j=map.get(s.charAt(i))+1;
                buffer= new StringBuffer();
                for(int k=j;k<=i;k++) {
                    buffer.append(s.charAt(k));
                }
                    System.out.println(buffer);
                map.put(s.charAt(i),i);
                }
                else{
                    buffer.append(s.charAt(i));
                map.put(s.charAt(i),i);
                }
                
            }
            ans = Math.max(ans,buffer.length());
        }
        
        return ans;
    }
}