class Solution {
    public int maxProfit(int[] prices) {
        int start = prices[0];
        int maxProfit =0;
        
        for(int i=1;i<prices.length;i++){
            
            int cost = prices[i];
            int profit = cost-start;
            maxProfit = Math.max(profit,maxProfit);
            start = Math.min(cost,start);
            
        }
        return maxProfit;
    }
}