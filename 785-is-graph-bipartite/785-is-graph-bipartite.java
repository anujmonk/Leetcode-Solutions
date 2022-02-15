class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] vis = new int[graph.length];
        
        
        for(int i=0;i<vis.length;i++) {
            if(vis[i]==0) {
                if(!visited(i,1,vis,graph)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean visited(int node,int val,int[] vis,int[][] graph) {
        
        // If already visited then color should be same
        if(vis[node]!=0) {
            return vis[node]==val;
        }
        
        vis[node]=val;
        val=-val;
        
        for(int ne:graph[node]){
            
            if(vis[ne]==0) {
                if(!visited(ne,val,vis,graph)) {
                    return false;
                }
            }
            else if(vis[ne]!=val) {
                return false;
            }
            
        }
        return true;
    }
}