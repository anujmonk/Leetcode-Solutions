class Solution {
    
    public boolean isAlienSorted(String[] words, String order) {
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<order.length();i++) {
            map.put(order.charAt(i),i);
        }
        
        for(int i=0;i<words.length-1;i++) {
            String a = words[i];
            String b = words[i+1];
            
            int r=0,c=0;
            boolean small=false;
            while(r<a.length() && c<b.length()) {
                if(map.get(a.charAt(r))>map.get(b.charAt(c))) {
                    return false;
                }
                else if(map.get(a.charAt(r))<map.get(b.charAt(c))){
                    small=true;
                    break;
                }
                r++;
                c++;
            }
            if(!small && c==b.length() && r!=a.length()) {
                return false;
            }
        }    
        
        
        return true;
    }
}