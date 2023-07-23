class Solution {
    public int maxProfit(int k, int[] prices) {
        return helperTab(prices, k);
    }
    static int helperTab(int[] prices,int k) {
        // Creating a 3d - dp of size [n+1][2][k+1] initialized to 0
        int[][][] dp = new int[prices.length + 1][2][k + 1];

        // As dp array is initialized to 0, we have already covered the base case

        for (int ind = prices.length - 1; ind >= 0; ind--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int cap = 1; cap <= k; cap++) {
                    if (buy == 0) { // We can buy the stock
                        dp[ind][buy][cap] = Math.max(0 + dp[ind + 1][0][cap],
                                -prices[ind] + dp[ind + 1][1][cap]);
                    } else { // We can sell the stock
                        dp[ind][buy][cap] = Math.max(0 + dp[ind + 1][1][cap],
                                prices[ind] + dp[ind + 1][0][cap - 1]);
                    }
                }
            }
        }

        return dp[0][0][k];
    }
}