// Approach 2
// TC: O(n)
// SC: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int minimumPriceTillNow = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int day=0; day<prices.length; day++){
            if(minimumPriceTillNow>prices[day])
                minimumPriceTillNow = prices[day];
            int todaySellingProfit = prices[day] - minimumPriceTillNow;
            if(maxProfit < todaySellingProfit)
                maxProfit = todaySellingProfit;
        }
        return maxProfit;
    }
}