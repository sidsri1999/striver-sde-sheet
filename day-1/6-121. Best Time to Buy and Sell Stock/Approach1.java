// Approach 1
// TC: O(n^2)
// SC: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            int buyingPrice = prices[i];
            for(int j=i+1; j<prices.length; j++){
                int sellingPrice = prices[j];
                if(maxProfit < (sellingPrice-buyingPrice)){
                    maxProfit = sellingPrice-buyingPrice;
                }
            }
        }
        return maxProfit;
    }
}