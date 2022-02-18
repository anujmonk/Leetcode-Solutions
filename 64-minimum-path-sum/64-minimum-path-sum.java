class Solution {
    public int minPathSum(int[][] grid) {
        
        int[][] pre = new int[grid.length][grid[0].length];
        
        
        return dp(grid,pre,0,0);
        
    }
    
    private int[][] d = {{1,0},{0,1}};
    
    private int sum=0;
    
    private int dp(int[][] grid,int[][] pre,int r,int c){
    
        if(r==grid.length-1 && c==grid[0].length-1) {
            pre[r][c]=grid[r][c];
            return grid[r][c];
        }
        
        if(pre[r][c]!=0) {
            return pre[r][c];
        }
        
        int down=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        
        
        if(isValid(grid,r+d[0][0],c+d[0][1])) {
            down= dp(grid,pre,r+d[0][0],c+d[0][1]); 
            down+=grid[r][c];
        }
        if(isValid(grid,r+d[1][0],c+d[1][1])) {
            right=dp(grid,pre,r+d[1][0],c+d[1][1]);
            right+=grid[r][c];
        }
        pre[r][c]=Math.min(down,right);
        
        return pre[r][c];
        
    }
    
    private boolean isValid(int[][] grid,int r,int c) {
        if(r<grid.length && c<grid[0].length) {
            return true;
        }
        
        return false;
    }
}