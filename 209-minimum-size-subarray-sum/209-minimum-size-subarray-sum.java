class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans =Integer.MAX_VALUE;
        
        int sum=0;
        int start=0;
        int end=0;
        boolean found=false;
        while(end<nums.length) {
            while(end<nums.length && sum<target) {
                sum+=nums[end];
                end++;
            }
            
            while(start<=end && sum>=target) {
                found=true;
                ans = Math.min(ans,end-start);
                sum-=nums[start];
                start++;      
            }
        }
        return found?ans:0;
    }
}