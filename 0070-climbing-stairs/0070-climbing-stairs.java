class Solution {
    public int climbStairs(int n) {
        Integer[] dp = new Integer[n+2];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n+1;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n+1];
    }
    public int solve(int n, Integer[] dp){
        //base
        if(n<=0)    return 0;

        //
        if(dp[n] != null)   return dp[n];

        int x = solve(n-1, dp);
        int y = solve(n-2, dp);
        dp[n] = x+y;
        return dp[n];
    }
}