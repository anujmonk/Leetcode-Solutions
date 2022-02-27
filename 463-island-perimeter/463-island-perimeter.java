class Solution {
    private int count=0;
    public int islandPerimeter(int[][] grid) {
        // Increase the perimeter count where there is a zero or you cannot perform             dfs
        
        int visited[][] =new int[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j]==1 && visited[i][j]==0) {
                    
                    visited[i][j]=1;
                    dfs(i,j,visited,grid);
                }
            }
        }
        //System.out.println(count);
        return count;
    }
    
    private int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    
    private boolean isValid(int r, int c, int[][] grid) {
        // Check if in range and if neighbor is 1
        if(((r>=0 && r<grid.length) && (c>=0 && c<grid[r].length))) {
            if(grid[r][c]==1) {
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    
    private void dfs(int i,int j,int[][] visited,int[][] grid) {
        visited[i][j]=1;
        
        for(int[] d:dir) {
            int nR = i+d[0];
            int nC = j+d[1];
            if(!isValid(nR,nC,grid)) {
                //System.out.println("here: "+nR+" "+nC + " "+isValid(nR,nC,grid));
                count++;
            }
            else if(visited[nR][nC]==0) {
                dfs(nR,nC,visited,grid);
            }
           
        }
    }
}