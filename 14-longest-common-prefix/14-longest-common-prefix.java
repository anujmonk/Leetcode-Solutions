class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length==1) {
            return strs[0];
        }
        String a = strs[0];
        String b = strs[1];
        int j=0;
        while(j<a.length() && j<b.length() && a.charAt(j)==b.charAt(j)) {
                j++;
        }
        StringBuffer buffer = new StringBuffer(a.substring(0,j));
        int max=j;
        
        for(int i=2;i<strs.length;i++) {
            String c = strs[i];
            j=0;
            while(j<c.length() && j<buffer.length() && c.charAt(j)==buffer.charAt(j)) {
                j++;
                //System.out.println(j);
            }
           // System.out.println(max);
            if(max>j) {
                buffer = new StringBuffer(buffer.substring(0,j));
                max=j;
            }
        }
        return buffer.toString();
    }
}