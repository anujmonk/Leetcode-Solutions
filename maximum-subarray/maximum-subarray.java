class Solution {
    public int maxSubArray(int[] nums) {
        // Using Kadane's algorithm
        
        int max=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum+nums[i]>nums[i])
                sum+=nums[i];
            else
                sum=nums[i];
            if(max<sum)
                max=sum;
        }
        return max;
    }
}
