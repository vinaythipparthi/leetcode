class Solution {
    int mod = (int)Math.pow(10,9)+7;
    int[][] keypad = {
        {4,6},
        {6,8},
        {7,9},
        {4,8},
        {0,3,9},
        {},
        {0,1,7},
        {2,6},
        {1,3},
        {2,4}
    };
    public int knightDialer(int n) {
        Integer[][] dp = new Integer[10][n+1];
        int result = 0;
        for(int i=0;i<=9;i++){
            result = (result+solve(i,n-1,dp)) % mod;
        }
        return result;
    }
    public int solve(int cell, int n, Integer[][] dp){
        if(n==0){
            return 1;
        }

        if(dp[cell][n] != null) return dp[cell][n];
        int ans = 0;
        for(int i=0;i<keypad[cell].length;i++){
            ans = (ans + solve(keypad[cell][i],n-1,dp)) % mod;
        }
        return dp[cell][n] = ans;
    }
}