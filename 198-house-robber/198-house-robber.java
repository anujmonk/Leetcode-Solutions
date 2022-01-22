class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        
        for(int i=1;i<dp.length;i++) {
            int choose = nums[i];
            if(i-2>=0) {
                choose+=dp[i-2];
            }
            dp[i]=Math.max(choose,dp[i-1]);
        }
        
        return Math.max(dp[dp.length-1],dp[dp.length-2]);
    }
}