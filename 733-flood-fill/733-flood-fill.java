class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int oldColor=image[sr][sc];
        if(oldColor!=newColor)
            helper(sr,sc,image,oldColor,newColor);
        
        return image;
    }
    
    private void helper(int r,int c,int[][] image, int oldColor,int newColor) {
        if(image[r][c]!=newColor){
            image[r][c]=newColor;
            for(int[] d:dir) {
                if(isValid(r+d[0],c+d[1],image,oldColor)) {
                    //image[r+d[0]][c+d[1]]=newColor;
                    helper(r+d[0],c+d[1],image,oldColor,newColor);
                }
            }
        }
    }
    
    private int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    
    private boolean isValid(int r, int c, int[][] image,int oldColor) {
        if((r>=0 && r< image.length) && (c>=0 && c< image[r].length)) {
            if(image[r][c]==oldColor) {
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}