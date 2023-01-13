class Solution {
    public int maximumWealth(int[][] accounts) {
        // int accounts[][] = new int [m][n];
        int maxWealth = 0;
        for(int i = 0; i < accounts.length; i++){
                int sum1 = 0;
            for(int j = 0; j< accounts[i].length; j++){
                sum1 +=accounts[i][j];
            }
              maxWealth =  Math.max(sum1,maxWealth);
        }
    return maxWealth;
    }
}