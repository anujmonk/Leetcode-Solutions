class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int r= matrix.length;
        int c= matrix[0].length;
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        // The trick is that output size must be less than total elements in matrix
        int n= (matrix.length)*(matrix[0].length);
        
        List<Integer> out = new ArrayList<>();

        while(left<=right || top<=bottom) {
            
            for(int j=left;j<=right && out.size()<n;j++) {
                out.add(matrix[top][j]);
            }
            top++;
            
            for(int i=top;i<=bottom && out.size()<n;i++) {
                out.add(matrix[i][right]);
                
            }
            right--;
            
            for(int j=right;j>=left && out.size()<n;j--) {
                out.add(matrix[bottom][j]);
            }
            bottom--;
            
            for(int i=bottom;i>=top && out.size()<n;i--) {
                out.add(matrix[i][left]);
            }
            left++;
        }
        
        return out;
    }
}