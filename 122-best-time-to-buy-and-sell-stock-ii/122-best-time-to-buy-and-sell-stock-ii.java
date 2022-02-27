class Solution {
    public int maxProfit(int[] prices) {
        //Greedy keep on increasing profit till you can
        int max=0;
        
        for(int i=0;i<prices.length-1;i++) {
            if(prices[i]<prices[i+1]) {
                max+=prices[i+1]-prices[i];
            }
        }
        
        return max;
    }
}