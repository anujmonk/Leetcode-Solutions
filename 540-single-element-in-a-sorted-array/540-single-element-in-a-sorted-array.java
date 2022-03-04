class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Using Binary Search
        
        int low=0,high=nums.length-1;
        if(low==high) {
                return nums[low];
            }
        while(low<high) {
            
            int mid = low + ((high-low)/2);
            
            int prev = mid-1;
            int next = mid+1;
            
            if(mid%2==0) {
                if(nums[mid]==nums[next]) {
                    low=mid+1;
                }
                else{
                    high=mid;
                }
            }
            else{
                if(nums[mid]==nums[prev]) {
                    low=mid+1;
                }
                else{
                    high=mid;
                }
            }
            //System.out.println(mid +" "+low+" "+high);
            if(low==high) {
                return nums[low];
            }
            
        }
        return -1;
    }
}