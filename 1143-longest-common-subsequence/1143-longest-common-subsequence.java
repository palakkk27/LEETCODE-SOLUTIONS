class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n][m];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return lcsutil(text1,text2,n-1,m-1,dp);
    }
    
    public int lcsutil(String s1,String s2,int i,int j,int[][] dp){
        if(i<0 || j<0) 
            return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = 1+lcsutil(s1,s2,i-1,j-1,dp);
        }else{
            return dp[i][j] = 0+Math.max(lcsutil(s1,s2,i-1,j,dp),
                                         lcsutil(s1,s2,i,j-1,dp));
        }
    }
}