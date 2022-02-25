class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        return helper(0,0,dp,m,n);
    }
    
    
    
    private int helper(int r,int c,int[][] dp,int m,int n) {
        if(r>=m || c>=n) {
            return 0;
        }
        
        if(dp[r][c]!=0) {
            return dp[r][c];
        }
        
        if(r==m-1 && c==n-1) {
            return 1;
        }    
        
        dp[r][c] = helper(r+1,c,dp,m,n) + helper(r,c+1,dp,m,n);
        
        return dp[r][c];
        
    }
}