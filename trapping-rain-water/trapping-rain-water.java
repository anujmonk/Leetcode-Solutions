class Solution {
    public int trap(int[] height) {
        // Using two arrays left and right each containing maximum value till the index
        if(height.length==0)
            return 0;
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        
        int max=height[0];
        left[0]=max;
        for(int i=1;i<left.length;i++){
            max=Math.max(max,height[i]);
            left[i]=max;
        }
        
        max=height[height.length-1];
        right[height.length-1]=max;
        for(int i=height.length-2;i>=0;i--){
            max=Math.max(max,height[i]);
            right[i]=max;
        }
        
        max=0;
        for(int i=0;i<height.length;i++){
            max+=Math.min(left[i],right[i])-height[i];
        }
        
        return max;
    }
}