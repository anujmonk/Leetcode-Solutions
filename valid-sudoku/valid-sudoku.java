class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        if(rowCheck(board) && columnCheck(board) && gridCheck(board))
            return true;
        
        return false;
        
    }
    
    public boolean rowCheck(char[][] board) {
        
        for(int i=0;i<board.length;i++) {
            int[] arr=new int[9];
            for(int j=0;j<board[i].length;j++) {
                if(board[i][j] - '0'>=0 && board[i][j] - '0'<=9) {
                    if(arr[(board[i][j] - '0')-1] == 0) {
                        arr[(board[i][j] - '0')-1]=1;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    continue;
                }   
            }
        }
        return true;
    }
    
    public boolean columnCheck(char[][] board) {
        
        for(int i=0;i<board.length;i++) {
            int[] arr=new int[9];
            for(int j=0;j<board[i].length;j++) {
                if(board[j][i] - '0'>=0 && board[j][i] - '0'<=9) {
                    if(arr[(board[j][i] - '0')-1] == 0) {
                        arr[(board[j][i] - '0')-1]=1;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    continue;
                }   
            }
        }
        return true;   
    }
    
     public boolean gridCheck(char[][] board){
        for(int rows = 0; rows<3; rows++){
            for(int cols=0; cols<3; cols++){
                int[] arr = new int[10];
                for(int i=3*rows; i<3*rows + 3; i++){
                    for(int j=3*cols; j<3*cols+3; j++){
                        if(board[j][i]=='.')
                            continue;
                        if(arr[board[j][i] - '0']!=0)
                            return false;
                        else
                            arr[board[j][i] - '0'] = 1;
                    }
                }
            }
        }
        System.out.println("Grid Check");
        return true;
    }
}