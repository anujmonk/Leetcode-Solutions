class Solution {
    public void solve(char[][] board) {
        // Brute Force would be to appy DFS to all zero but optimisation can be to just apply DFS           // to border 0s 
    
        int[][] visited = new int[board.length][board[0].length];
        
        // Top Row DFS
        for(int j=0;j<board[0].length;j++) {
            if(board[0][j]=='O' && visited[0][j]==0) {
                visited[0][j]=1;
                dfs(board,visited,0,j);
            }
        }
        
        // Bottom Row DFS
        for(int j=0;j<board[0].length;j++) {
            
            if(board[board.length-1][j]=='O' && visited[board.length-1][j]==0) {
                visited[board.length-1][j]=1;
                dfs(board,visited,board.length-1,j);
            }
        }
        
        
        
        // Left Col DFS
        for(int i=0;i<board.length;i++) {
            if(board[i][0]=='O' && visited[i][0]==0) {
                visited[i][0]=1;
                dfs(board,visited,i,0);
            }
        }
        
        // Right Row DFS
        for(int i=0;i<board.length;i++) {
            if(board[i][board[i].length-1]=='O' && visited[i][board[i].length-1]==0) {
                visited[i][board[i].length-1]=1;
                dfs(board,visited,i,board[i].length-1);
            }
        }
        
        
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                if(visited[i][j]==0 && board[i][j]=='O') {
                    board[i][j]='X';
                }
            }
        }
        
    }
    
    private int[][] dir= {{-1,0},{1,0},{0,1},{0,-1}};
    
    private void dfs(char[][] board, int[][] visited,int r, int c) {
        
        for(int i=0;i<dir.length;i++) {
            int nR=r+dir[i][0];
            int nC=c+dir[i][1];
            
            if(isValid(board,nR,nC) && visited[nR][nC]==0 && board[nR][nC]=='O') {
                visited[nR][nC]=1;
                dfs(board,visited,nR,nC);
            }
        }
        
    }
    
    
    private boolean isValid(char[][] board,int r,int c) {
        
        if((r>=0 && r<board.length) && (c>=0 && c<board[r].length)) {
            return true;
        }
        
        return false;
    }
}