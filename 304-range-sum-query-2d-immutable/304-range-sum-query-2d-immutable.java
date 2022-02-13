class NumMatrix {

    private int[][] currMatrix;
    
    public NumMatrix(int[][] matrix) {
        currMatrix=new int[matrix.length][matrix[0].length];
        currMatrix[0][0] = matrix[0][0];
        
        // Preprocess the first row
        for(int j=1;j<matrix[0].length;j++){
            currMatrix[0][j]=currMatrix[0][j-1]+matrix[0][j];
        }
        
        // Preprocess the first col
        for(int i=1;i<matrix.length;i++){
            currMatrix[i][0]=currMatrix[i-1][0]+matrix[i][0];
        }
        
        // Preprocess the sumgrid
        for(int i=1;i<matrix.length;i++) {
            for(int j=1;j<matrix[i].length;j++) {
                currMatrix[i][j]=matrix[i][j]+currMatrix[i][j-1]+currMatrix[i-1][j]-currMatrix[i-1][j-1];
            }
        }
        
        
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        int sum=currMatrix[row2][col2];
        
        // Upper
        if(row1-1>=0) {
            sum-=currMatrix[row1-1][col2];
        }
        //Lower
        if(col1-1>=0) {
            sum-=currMatrix[row2][col1-1];
        }
        //Addition
        if(row1-1>=0 && col1-1>=0) {
            sum+=currMatrix[row1-1][col1-1];
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */