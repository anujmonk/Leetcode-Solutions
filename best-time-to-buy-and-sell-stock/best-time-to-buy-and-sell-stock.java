class Solution {
    public int maxProfit(int[] prices) {
        int minVal=prices[0],res=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-minVal>res)
                res=prices[i]-minVal;
            if(prices[i]<minVal)
                minVal=prices[i];
        }
        return res;
    }
}
