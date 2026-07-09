// Last updated: 09/07/2026, 09:51:35
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        // Sum all positive adjacent differences.
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}