class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        Queue<int[]> queue= new LinkedList<>();
        
        int check=image[sr][sc];
        if(check==newColor) {
            return image;
        }
        image[sr][sc]=newColor;
        
        queue.add(new int[]{sr,sc});
        
        
        while(!queue.isEmpty()) {
            int size=queue.size();
             
            while(size!=0) {
                
                int[] current= queue.poll();
                
                for(int[] dir:directions) {
                    int r=dir[0]+current[0];
                    int c=dir[1]+current[1];
                    
                    if(isValid(image,r,c) && image[r][c]==check) {
                        image[r][c]=newColor;
                        queue.add(new int[]{r,c});
                    }
                }
                
                size--;
            }
        }
        
        return image;
    }
    
    private int[][] directions= {{1,0},{-1,0},{0,1},{0,-1}};
    
    private boolean isValid(int[][] image, int r,int c) {
        if((r>=0 && r< image.length) && (c>=0 && c<image[0].length)) {
            return true;
        }
        return false;
    }
}