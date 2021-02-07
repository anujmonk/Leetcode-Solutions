class Solution {
    public int findMin(int[] nums) {
        // We can apply linear search to find the minimum element where minimum element would be an element which is smaller            // than both of its neighbours.
        // Since array is sorted we can apply Binary Search 
        
        int low=0,high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            
        // I have to make sure mid is 0 or n-1
        //  if((mid==0 && nums[mid]<nums[mid+1]) || (mid==n-1 && nums[mid-1]>nums[mid]) || (nums[mid-1]>nums[mid] &&                   //   nums[mid+1]>nums[mid]))
            
            // Instead of writing above line I could use
            int next=(mid+1)%nums.length;
            int prev=(mid+nums.length-1)%nums.length;
            // The above thing is to make indexing rotated It is a good thing to remember
            if(nums[low]<nums[high])
                return nums[low];
            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next]){
                ans=nums[mid];
                break;
            }
            // Since we need to move in unsorted array we are checking with nums[low] and nums[high]
            else if(nums[low]<=nums[mid])
                low=mid+1;
            else if(nums[high]>=nums[mid])
                high=mid-1;
        }
        return ans;
    }
}