class Solution {
    
    private int[][] dir= {{1,0}, {-1,0}, {0,1}, {0,-1}};
    private boolean check=false;
    
    public boolean exist(char[][] board, String word) {
        
        boolean[][] visited= new boolean[board.length][board[0].length];
        
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j]==word.charAt(0)) {
                    visited[i][j]=true;
                    dfs(board,word,visited,i,j,1);
                    if(check){
                        return true;
                    }
                    visited[i][j]=false;
                }
            }
        }
        
        return false;
    }
    
    private void dfs(char[][] board,String word,boolean[][] visited,int r,int c,int index) {
        
        if(index==word.length()) {
            check=true;
            return;
        }
        
        for(int i=0;i<dir.length;i++) {
            int rN=r+dir[i][0];
            int cN=c+dir[i][1];
            if(isValid(board,rN,cN) && visited[rN][cN]==false && word.charAt(index)==board[rN][cN]) {
                visited[rN][cN]=true;
                dfs(board,word,visited,rN,cN,index+1);
                visited[rN][cN]=false;
            }
        }   
    }
    
    private boolean isValid(char[][] board,int r, int c) {
        if((r>=0 && r<board.length) && (c>=0 && c<board[0].length)) {
            return true;
        }
        return false;
    }
}