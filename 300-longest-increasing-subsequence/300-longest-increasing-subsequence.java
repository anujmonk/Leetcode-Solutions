class Solution {
    public int lengthOfLIS(int[] nums) {
        // Clasic Dp problem as increasing sequence of the current element will depend on the previous elements
        
        int[] dp = new int[nums.length];
        
        // Each element is its own increasing sequence
        Arrays.fill(dp,1);
        int ans=1;
        for(int i=1;i<nums.length;i++) {
            
            for(int j=i-1;j>=0;j--) {
                if(nums[i]>nums[j]) {
                    
                    dp[i]=Math.max(1+dp[j],dp[i]);
                }   
            }
            
            ans=Math.max(ans,dp[i]);
            
        }
    
        
        return ans;
        
    }
}