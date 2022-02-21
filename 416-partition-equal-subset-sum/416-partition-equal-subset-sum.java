class Solution {
    
    boolean ans = false;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums) {
            sum+=i;
        }
        if(sum%2!=0) {
            return false;
        }
        
        int[][] dp = new int[nums.length][sum/2];
        
        if (helper(nums,0,sum/2,0,dp) == 2) {
            return true;
        }
        
        // for(int i=0;i<dp.length;i++) {
        //     for(int j=0;j<dp[i].length;j++) {
        //         System.out.print(dp[i][j]);
        //     }
        //     System.out.println();
        // }
        
        return false;
    }
    
    private int helper(int[] nums,int curr,int need,int idx,int[][] dp) {
       
        
        if(idx>=nums.length || need<0) {
            return 1;
        }
        
        if(need == 0) {
            return 2;
        }
        
        if(dp[idx][curr]!=0) {
            return dp[idx][curr];   
        }
        
        int use =helper(nums,curr+nums[idx],need-nums[idx],idx+1,dp);
        // System.out.println("use "+use);
        if (use==2) {
            dp[idx][curr] = 2;
            return dp[idx][curr];
        }
        int skip=  helper(nums,curr,need,idx+1,dp); 
        // System.out.println("skip "+skip);
        if(skip==2) {
            dp[idx][curr] = 2;
            return dp[idx][curr];
        }
        
        dp[idx][curr] = 1;
   
        return dp[idx][curr];
        
    }
}