class Solution {
    public int numEnclaves(int[][] grid) {
        
        int[][] visited = new int[grid.length][grid[0].length];
        
       
            for(int i=0;i<grid[0].length;i++) {
                if(grid[0][i]==1)
                    dfs(0,i,grid,visited);
        
            }
                
            for(int i=0;i<grid[0].length;i++) {
                if(grid[grid.length-1][i]==1)
                    dfs(grid.length-1,i,grid,visited);
            }
                
        
            for(int i=0;i<grid.length;i++) {
                if(grid[i][0]==1)
                    dfs(i,0,grid,visited);
            }
                
        
            for(int i=0;i<grid.length;i++) {
                if(grid[i][grid[0].length-1]==1)
                    dfs(i,grid[0].length-1,grid,visited);
            }
        
        int count =0 ;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
               // System.out.print(visited[i][j]+" ");
                if(grid[i][j]==1 && visited[i][j]==0) {
                    count++;
                }
            }
            System.out.println();
        }
        return count;
    }
    
    private void dfs(int r,int c,int[][] grid,int[][] visited) {
        
        if(visited[r][c]==1) {
            return;
        }
        
        visited[r][c]=1;
        for(int[] d:dir) {
            if(isValid(r+d[0],c+d[1],grid)) {
                dfs(r+d[0],c+d[1],grid,visited);
            }
        }
    }
    
    private int[][] dir= {{0,1},{1,0},{0,-1},{-1,0}};
    
    private boolean isValid(int r,int c,int[][] grid) {
        if((r>=0 && r<grid.length) && (c>=0 && c<grid[r].length)) {
            if(grid[r][c]==1)
                return true;
            else
                return false;
        }
        return false;
    }
}