class Solution {
    public String reverseWords(String s) {
        
        // Removing leading and trailing spaces;
        s=s.trim();
        
        List<String> list = new ArrayList<>();
        
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') {
                if(builder.length()!=0) {
                    
                    list.add(builder.toString());
                    builder=new StringBuilder();
                }
                continue;
            }
            else {
                builder.append(s.charAt(i));
            }
        }
        
        list.add(builder.toString());
        
        Collections.reverse(list);
        
        return String.join(" ",list);
        
    }
}