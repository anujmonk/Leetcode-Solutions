class Solution {
    public int heightChecker(int[] heights) {
        
        // Creating a new sorted array and comparing the values with given array 
        
        if(heights==null || heights.length==0)
            return 0;
        
        int[] sorted_heights=new int[heights.length];
        System.arraycopy(heights,0,sorted_heights,0,heights.length);
        Arrays.sort(sorted_heights);
        int count=0;
        
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=sorted_heights[i])
                count++;
        }
        return count;
    }
}
