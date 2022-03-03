class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuffer buffer = new StringBuffer();
        helper(n,0,0,buffer,ans);
        return ans;
        
    }
    
    private void helper(int n, int open,int close,StringBuffer buffer,List<String> ans) {
        if(buffer.length()==2*n) {
            ans.add(buffer.toString());
            return;
        }
        
        if(open<n) {
            buffer.append("(");
            helper(n,open+1,close,buffer,ans);
            buffer.deleteCharAt(buffer.length()-1);
        }
        
        if(close<open) {
            buffer.append(")");
            helper(n,open,close+1,buffer,ans);
            buffer.deleteCharAt(buffer.length()-1);
        }
    }
}