class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int r = mat.length;
        int c = mat[0].length;
        int[][] ans = new int[r][c];
        
        Queue<int[]> q = new LinkedList<>();
        
        // Multi Source BFS Storing all zeroes 
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(mat[i][j]==0) {
                    q.add(new int[]{i,j});
                }
            }
        }
        
        int level=0;
        while(!q.isEmpty()) {
            
            int size=q.size();
            level++;
            while(size!=0){
                
                int[] t = q.poll();

                for(int[] d:dir) {
                    int rN= t[0]+d[0];
                    int cN= t[1]+d[1];
                    if(isValid(mat,rN,cN) && mat[rN][cN]==1 && ans[rN][cN]==0) {
                        ans[rN][cN]=level;
                        q.add(new int[]{rN,cN});
                    }
                    
                }
                size--;
            }
            
        }
        
        return ans;
        
    }
    
    private boolean isValid(int[][] mat,int r,int c) {
        if((r>=0 && r<mat.length) && (c>=0 && c<mat[0].length)) {
            return true;
        }
        return false;
    }
    
    private int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
}