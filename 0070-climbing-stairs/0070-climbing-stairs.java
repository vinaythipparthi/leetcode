class Solution {
    public int climbStairs(int n) {
        Integer[] dp = new Integer[n+1];
        return climb(0,n,dp);
    }
    public int climb(int i, int n, Integer[] dp){
        //base case
        if(i>n) return 0;
        if(i==n)    return 1;

        if(dp[i] != null)   return dp[i];
        int x = climb(i+1, n, dp);
        int y = climb(i+2, n, dp);
        dp[i] = x+y;
        return dp[i];
    }
}