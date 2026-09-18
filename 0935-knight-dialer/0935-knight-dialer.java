class Solution {
    int m = (int)Math.pow(10,9) + 7;
    int[][] adj = {
        {4,6},
        {8,6},
        {7,9},
        {4,8},
        {3,9,0},
        {},
        {1,7,0},
        {2,6},
        {1,3},
        {2,4}
    };
    public int knightDialer(int n) {
        int result = 0;
        Integer[][] dp = new Integer[n+1][10];
        for(int i=0;i<=9;i++){
            result = (result + solve(n-1, i, dp)) % m;
        }
        return result;
    }
    public int solve(int n, int cell, Integer[][] dp){
        if(n==0)    return 1;

        if(dp[n][cell] != null) return dp[n][cell];
        int ans = 0;
        for(int i=0;i<adj[cell].length;i++){
            int val = adj[cell][i];
            ans = (ans + solve(n-1, val, dp)) % m;
        }
        return dp[n][cell] = ans;
    }
}