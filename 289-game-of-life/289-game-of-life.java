class Solution {
    public void gameOfLife(int[][] board) {
        
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                if(board[i][j]==0) {
                    board[i][j]=2;
                }   
            }
        }
        
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                int liveNeighbor=0;
                
                for(int k=0;k<dir.length;k++) {
                    int r= i+dir[k][0];
                    int c= j+dir[k][1];
                    if(isValid(board,r,c) && Math.abs(board[r][c])==1) {
                        liveNeighbor++;
                    }    
                }
                
                if(board[i][j]==1) {
                    if(liveNeighbor<2 || liveNeighbor>3) {
                        board[i][j]=-board[i][j];
                    }
                }
                else {
                    if(liveNeighbor == 3) {
                        board[i][j]=-board[i][j];
                    }
                }
                
            }
        }
        
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                if(board[i][j]==-2) {
                    board[i][j]=1;
                }
                else if(board[i][j]==2) {
                    board[i][j]=0;
                }
                else if(board[i][j]==-1) {
                    board[i][j]=0;
                }
            }
        }
        
    }
    
    private int[][] dir= {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
    
    private boolean isValid(int[][] board,int r,int c) {
        if((r>=0 && r<board.length) && (c>=0 && c<board[0].length)) {
            return true;
        }
        return false;
    }
}