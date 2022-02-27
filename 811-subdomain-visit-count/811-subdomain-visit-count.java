class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<cpdomains.length;i++) {
            String str =cpdomains[i];
            
            String[] space = str.split(" ");
            int count = Integer.valueOf(space[0]);
            
            String dots = space[1];
              
            
            String[] dot = dots.split("\\.");
            
            for(int k=0;k<dot.length;k++) {
                
                StringBuffer buffer = new StringBuffer();
                for(int j=k;j<dot.length;j++) {
                    buffer.append(dot[j]);
                    buffer.append(".");
                    
                   
                }
                buffer.deleteCharAt(buffer.length()-1);
                
                if(map.containsKey(buffer.toString())) {
                    map.put(buffer.toString(),map.get(buffer.toString())+count);
                }
                else{
                    map.put(buffer.toString(),count);
                }
            }
        }
       
        List<String> ans = new ArrayList<>();
        
        for(Map.Entry<String,Integer> entry:map.entrySet()) {
            StringBuffer buffer = new StringBuffer();
            buffer.append(entry.getValue());
            buffer.append(" ");
            buffer.append(entry.getKey());
            ans.add(buffer.toString());
        }
        
        return ans;
    }
}