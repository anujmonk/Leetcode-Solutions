class Solution {
    public int maxProfit(int[] prices) {
        
        int[] maxRight = new int[prices.length];
        
        maxRight[prices.length-1] = 0;
        int maxR = prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--) {
            if(prices[i]>maxR) {
                maxR= prices[i];
            }
            else {
                maxRight[i]=maxR;
            }
        }
        
        int ans=0;
        for(int i=0;i<prices.length;i++) {
            if(maxRight[i]!=0 && maxRight[i]-prices[i]>ans) {
                ans = maxRight[i]-prices[i];
            }
        }
        
        return ans;
    }
}