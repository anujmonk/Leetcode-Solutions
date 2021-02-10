class Solution {
    public int findPeakElement(int[] nums) {
        int l=0,h=nums.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if( (m==0 || nums[m-1]<nums[m]) && (m==nums.length-1 || nums[m]>nums[m+1]) )
                return m;
            if(m!=0 && nums[m-1]>nums[m])
                h=m-1;
            else
                l=m+1;
        }
        return -1;
    }
}