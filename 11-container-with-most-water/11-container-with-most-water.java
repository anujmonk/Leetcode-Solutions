class Solution {
    public int maxArea(int[] height) {
        int low =0,high=height.length-1;
        
        int area =0;
        while(low<high) {
            int tempArea = (high-low)*Math.min(height[low],height[high]);
            area = Math.max(area,tempArea);
            if(height[low]>height[high]) {
                high--;
            }
            else{
                low++;
            }
        }
        return area;
    }
}