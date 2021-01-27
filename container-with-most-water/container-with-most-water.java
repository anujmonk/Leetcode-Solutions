class Solution {
    public int maxArea(int[] height) {
        int length=0,width=height.length-1,area=0,max_area=0;
        while(length<width){
            area=(width-length)*Math.min(height[length],height[width]);
            if(area>max_area)
                max_area=area;
            if(height[length]<height[width])
                length++;
            else
                width--;
        }
        return max_area;
    }
}
