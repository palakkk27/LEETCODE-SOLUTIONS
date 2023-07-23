class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n+1][2][3];
        for(int[][] row : dp) for(int[] col : row) Arrays.fill(col, -1);
        return helper(prices,0,1,2,dp);
    }
    public int helper(int[] prices, int index, int buy, int limit,int[][][] dp){
        // Base Case
        if(index == prices.length) return 0;
        if(limit == 0) return 0;
        if(dp[index][buy][limit]!=-1) return dp[index][buy][limit];

        int totalProfit = 0;
        if(buy == 1){
            int buyKaro = -prices[index] + helper(prices, index + 1, 0, limit,dp);
            int skipKaro = helper(prices, index + 1, 1, limit,dp);
            totalProfit = Math.max(buyKaro, skipKaro);
        }else{
            int sellKaro = prices[index] + helper(prices, index + 1, 1, limit - 1,dp);
            int skipKaro = helper(prices, index + 1, 0, limit,dp);
            totalProfit = Math.max(sellKaro, skipKaro);
        }
        return dp[index][buy][limit] = totalProfit;
    }
}