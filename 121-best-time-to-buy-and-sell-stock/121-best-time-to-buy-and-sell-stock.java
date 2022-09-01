class Solution {
    public int maxProfit(int[] nums) {
        int start = nums[0];
        int maxProfit = 0;
        
        for(int i=1;i<nums.length;i++){
            int cost = nums[i];
            int profit = cost - start;
            maxProfit = Math.max(maxProfit, profit);
            start = Math.min(start, cost);
        }
        return maxProfit;
    }
}