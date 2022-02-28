class Solution {
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        
        int[][] visited = new int[grid.length][grid[0].length];
        // for(int i=0;i<visited.length;i++) {
        //     for(int j=0;j<visited[i].length;j++) {
        //         visited[i][j]=-1;
        //     }
        // }
        
        
        
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j]==1 && visited[i][j]==0) {
                    count=1;
                    helper(i,j,visited,grid);
                  
                    ans=Math.max(ans,count);
                    count=0;
                }
            }
        }
        
        return ans;
    }
    
    private int[][] dir = {{0,1},{0,-1}, {1,0}, {-1,0}};
    
    private boolean isValid(int r,int c,int[][] grid,int[][] visited) {
        if((r>=0 && r<grid.length) && (c>=0 && c<grid[r].length)) {
            if(visited[r][c]==0)
                return true;
            else
                return false;
        }
        return false;
    }
    
    private void helper(int r,int c,int[][] visited,int[][] grid) {
        visited[r][c]=1;
        
        for(int[] d: dir) {
            int rN=r+d[0];
            int cN=c+d[1];
            
            if(isValid(rN,cN,grid,visited) && grid[rN][cN]==1) {
                count++;
                helper(rN,cN,visited,grid);
            }
        }
        
    }
}