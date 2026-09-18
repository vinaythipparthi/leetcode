class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] dp = new Integer[m+1][n+1];
        return solve(0,0,m,n,dp);
    }
    public int solve(int i, int j, int m, int n, Integer[][]dp){
        //base case
        if(i==m-1 && j==n-1)    return 1;
        if(i>=m || j>=n)  return 0;

        if(dp[i][j] != null)    return dp[i][j];
        int x = solve(i+1,j,m,n,dp);
        int y = solve(i,j+1,m,n,dp);
        return dp[i][j] = x+y;
    }
}