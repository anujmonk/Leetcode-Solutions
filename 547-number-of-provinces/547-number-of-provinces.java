class Solution {
    public int findCircleNum(int[][] isConnected) {
     
        int[] visited = new int[isConnected.length];
        
        int provinces=0;
        for(int i=0;i<isConnected.length;i++) {
            if(visited[i]==0) {
                provinces++;
                dfs(isConnected,i,visited);
            }
        }
        return provinces;
    }
    
    
    private void dfs(int[][] isConnected,int row,int[] visited) {
        
        if(visited[row]==1) {
            return;
        }
        
        visited[row]=1;
        
        for(int col=0;col<isConnected[row].length;col++) {
            if(isConnected[row][col]==1 && visited[col]==0) {
                dfs(isConnected,col,visited);
            }
        }
        
    }
}