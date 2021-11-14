class Solution {
    public void sortColors(int[] nums) {
        
        int low=-1;
        int mid=0;
        int high=nums.length-1;
        
        while(mid<=high) {
            if(nums[mid]==0) {
                low++;
                swap(low,mid,nums);
                mid++;
            }
            else if(nums[mid]==1) {
                mid++;
            }
            else if(nums[mid]==2) {
                swap(mid,high,nums);
                high--;
            }
        }
        
        
    }
    
    public void swap(int low,int high,int[] nums) {
        int temp=nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
    }
}