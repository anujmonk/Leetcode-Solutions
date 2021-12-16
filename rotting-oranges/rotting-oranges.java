class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) {
            return 0;
        }
        
        int r=grid.length;
        int c=grid[0].length;
        
        Queue<int[]> queue= new LinkedList<>();
        Set<int[]> set=new HashSet<>();
        boolean fresh = false;
        
        // Finding all the rotten oranges
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(grid[i][j]==2) {
                    int[] rotten = {i,j};
                    queue.add(rotten);
                }
                else if(!fresh && grid[i][j]==1) {
                    fresh=true;
                }
            }
        }
        
        // No rotten orange or no fresh orange
        if(!fresh) {
            return 0;
        }
        if(queue.isEmpty()) {
            return -1;
        }
        
        int minute=0;
        while(!queue.isEmpty())
        {
            ++minute;
            int size=queue.size();
            
            while(size!=0) {
                int[] arr= queue.poll();
                if(set.contains(arr)) {
                    size--;
                    continue;
                }
                else{
                    set.add(arr);
                    for(int[] dir:directions) {
                        int rN = dir[0]+arr[0];
                        int cN = dir[1]+arr[1];

                        if(isValid(grid,rN,cN) && grid[rN][cN]==1) {
                            grid[rN][cN]=2;
                            int[] nArr = {rN,cN};
                            queue.add(nArr);
                        }
                    }
                }
                size--;
            }
        }
        
        // Checking if any fresh orange left
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(grid[i][j]==1) {
                    return -1;
                }
            }
        }
        
        return minute-1;
        
    }
    
    private int[][] directions= {{0,1},{1,0},{-1,0},{0,-1}};
    
    private boolean isValid(int[][] grid, int i,int j) {
        if((i>=0 && i<grid.length) && (j>=0 && j<grid[0].length)) {
            return true;
        }
        return false;
    }
}