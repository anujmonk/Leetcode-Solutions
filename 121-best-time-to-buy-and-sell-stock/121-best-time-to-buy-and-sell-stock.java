class Solution {
    public int maxProfit(int[] prices) {
        
        int low = 0;
        int profit = 0;
        int mProfit =0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i]<prices[low]) {
                low=i;
                profit=0;
            }
            else {
                profit=(prices[i]-prices[low]);
                mProfit = Math.max(mProfit,profit);
            }
        }
        return mProfit;
    }
}