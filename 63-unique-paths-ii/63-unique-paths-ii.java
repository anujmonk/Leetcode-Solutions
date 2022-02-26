class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[i].length;j++) {
                dp[i][j]=-1;
            }
        }
        
        return helper(0,0,obstacleGrid,dp);
    }
    
    private int helper(int r,int c,int[][] obstacleGrid,int[][] dp) {
        
        
        // Out of Bound
        if(r>= obstacleGrid.length || c>= obstacleGrid[0].length) {
            return 0;
        }
        
        // Reached bottom
        if(r==obstacleGrid.length-1 && c==obstacleGrid[r].length-1) {
            if(obstacleGrid[r][c]==0)
                return 1;
            else
                return 0;
        }
        
        // If already solved
        if(dp[r][c]!=-1) {
            
            return dp[r][c];
        }
        
        //If obstacle is present
        if(obstacleGrid[r][c]==1) {
            dp[r][c]=0;
            return dp[r][c];
        }
        
        dp[r][c]= helper(r+1,c,obstacleGrid,dp) + helper(r,c+1,obstacleGrid,dp);
        return dp[r][c];
        
    }
}