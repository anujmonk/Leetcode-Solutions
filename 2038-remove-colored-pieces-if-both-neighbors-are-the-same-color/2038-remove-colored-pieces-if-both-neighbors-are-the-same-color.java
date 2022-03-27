class Solution {
    public boolean winnerOfGame(String colors) {
        int al = 0 ;
        int bob = 0;
        
        for(int i=1;i<colors.length()-1;i++) {
            if(colors.charAt(i)==colors.charAt(i-1) && colors.charAt(i)==colors.charAt(i+1)) {
                if(colors.charAt(i)=='A') {
                    al++;
                }
                else{
                    bob++;
                }
            }
        }
        
        if(al>bob) {
            return true;
        }
        return false;
    }
}