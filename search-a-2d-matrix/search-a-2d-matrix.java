class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null)
            return false;
        int n=matrix.length;
        int m=matrix[0].length;
        
        int col=matrix[0].length-1;
        int row=0;
        
        while((row<n && row>=0) && (col>=0 && col<m)){
            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col]>target)
                col--;
            else
                row++;
        }
        return false;
    }
}