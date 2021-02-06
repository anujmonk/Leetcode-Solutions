class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] out=new int[2];
        int low=0,high=nums.length-1;
        int first=-1,last=-1;
        
        //First occurrence 
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        out[0]=first;
        
        //Last Occurrence
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        out[1]=last;
        
        return out;
    }
}