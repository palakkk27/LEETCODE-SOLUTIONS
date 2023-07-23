class Solution {
    //Tablulation form
    public int maxProfit(int[] prices) {
        
        return helper(prices);
    }
    public int helper(int[] prices){
        int[][][] dp = new int[prices.length+1][2][3];
        for(int[][] row : dp) for(int[] col : row) Arrays.fill(col, 0);
        
         for(int index = prices.length - 1; index >= 0; index--){
            for(int buy = 0; buy < 2; buy++){
                for(int limit = 1; limit < 3; limit++){
        int totalProfit = 0;
        if(buy == 1){
                        int buyKaro = -prices[index] + dp[index + 1][0][limit];
                        int skipKaro = dp[index + 1][1][limit];
                        totalProfit = Math.max(buyKaro, skipKaro);
                    }else{
                        int sellKaro = prices[index] + dp[index + 1][1][limit - 1];
                        int skipKaro = dp[index + 1][0][limit];
                        totalProfit = Math.max(sellKaro, skipKaro);
                    }
                    dp[index][buy][limit] = totalProfit;
                }
            }
    }
        return dp[0][1][2];
    }
}