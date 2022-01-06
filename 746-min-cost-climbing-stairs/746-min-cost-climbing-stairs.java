class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        
        int[] sum= new int[cost.length];
        
        sum[0]=cost[0];
        sum[1]=Math.min(cost[1],cost[0]+cost[1]);
        for(int i=2;i<cost.length;i++) {
            sum[i]=cost[i]+Math.min(sum[i-1],sum[i-2]);
        }
        
        return Math.min(sum[cost.length-1],sum[cost.length-2]);
    }
}