class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        if(p.length()>s.length()) {
            return new ArrayList<>();
        }
        
        List<Integer> res = new ArrayList<>();
        
        int[] pCount = new int[26];
        
        for(int i=0;i<p.length();i++) {
            char ch = p.charAt(i);
            pCount[ch-'a']+=1;
        }
        
        int[] sCount = new int[26];
        for(int i=0;i<p.length();i++) {
            char ch = s.charAt(i);
            sCount[ch-'a']+=1;
        }
        
        int start = 0;
        int end = p.length()-1;

        boolean notMatch=false;
        
        while(end<s.length()) {
            System.out.print(start+" "+end+", ");
            notMatch=false;
            int i=0;
            for(i=0;i<26;i++) {
                if(pCount[i]!=sCount[i]) {
                    notMatch=true;
                    break;
                }
            }
            
            if(!notMatch) {
                
                res.add(start);
            }
            sCount[s.charAt(start)-'a']-=1;
            start++;
            
            end++;
            
            if(end==s.length()) {
                        break;
            }
            sCount[s.charAt(end)-'a']+=1;
        }
        return res;
    }
}