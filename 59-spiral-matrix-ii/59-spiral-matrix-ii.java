class Solution {
    public int[][] generateMatrix(int n) {
        int c=1;
        
        int[][] ans = new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        
        while(top<=bottom && left<=right) {
            
            for(int j=left;j<=right && c<=n*n;j++) {
                ans[top][j]=c;
                c++;
            }
            top++;
            
            for(int i=top;i<=bottom && c<=n*n;i++) {
                ans[i][right]=c++;
            }
            right--;
            
            for(int j=right;j>=left && c<=n*n;j--) {
                ans[bottom][j]=c++;
            }
            bottom--;
            
            for(int i=bottom;i>=top && c<=n*n;i--) {
                ans[i][left]=c++;
            }
            left++;
        }
        
        return ans;
    }
}