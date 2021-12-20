class Solution {
    
    private Set<List<Integer>> set = new HashSet<>();
    
    public int numIslands(char[][] grid) {
         
        int level=0;
        
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]=='1') {
                    List<Integer> list = new ArrayList<>();
                        list.add(i);
                        list.add(j);
                    
                    if(!set.contains(list)) {
                        level = bfs(grid,i,j,level);
                    }
                }
            }
        }
        
    return level;
    }
    
    private int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    
    private int bfs(char[][] grid,int r,int c,int level) {
        
        
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r,c});
        
        boolean check = false;
        while(!q.isEmpty()) {
            
            int[] t = q.poll();
            
            for(int i=0;i<dir.length;i++) {
                
                int rN = t[0] + dir[i][0];
                int cN = t[1] + dir[i][1];
                
                List<Integer> list = new ArrayList<>() {{
                        add(rN);
                        add(cN);
                    }};
                
                if(isValid(grid,rN,cN) && !set.contains(list) && grid[rN][cN]=='1') {
                    
                    set.add(list);
                    q.add(new int[]{rN,cN});
                }
            }
            
        }
        
        return ++level;
    }
    
    private boolean isValid(char[][] grid,int r,int c) {
        
        if((r>=0 && r<grid.length) && (c>=0 && c<grid[0].length)) {
            return true;
        }
        return false;
    }
}


//DFS 
/**
class Solution {
    
    public int numIslands(char[][] grid) {
         
        int level=0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
        
                    if(grid[i][j]=='1') {
                        level++;
                        dfs(grid,i,j);
                    }
                
            }
        }
        
    return level;
    }
    
    private int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    
    private void dfs(char[][] grid,int r,int c) {
            
            for(int i=0;i<dir.length;i++) {
                
                int rN = r + dir[i][0];
                int cN = c + dir[i][1];
                
                List<Integer> list = new ArrayList<>() {{
                        add(rN);
                        add(cN);
                    }};
                
                if(isValid(grid,rN,cN) && grid[rN][cN]=='1') {
                    
                    grid[rN][cN] = '0';
                    dfs(grid,rN,cN);
                }
            }
        }
        
    private boolean isValid(char[][] grid,int r,int c) {
        
        if((r>=0 && r<grid.length) && (c>=0 && c<grid[0].length)) {
            return true;
        }
        return false;
    }
}
**/
