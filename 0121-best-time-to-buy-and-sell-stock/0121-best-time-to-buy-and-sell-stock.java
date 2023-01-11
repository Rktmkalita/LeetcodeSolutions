class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i = 0; i < prices.length; i++){
            int profit = 0;
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            profit = prices[i] - buyPrice;
            if(maxProfit < profit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}