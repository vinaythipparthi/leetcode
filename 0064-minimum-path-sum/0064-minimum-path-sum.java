class Solution {
    public int minPathSum(int[][] grid) {
        Integer[][] dp = new Integer[grid.length][grid[0].length];
        return solve(0,0,grid,dp);
    }
    public int solve(int i, int j, int[][] grid, Integer[][] dp){
        //base case
        if(i >= grid.length || j >= grid[0].length){
            return Integer.MAX_VALUE;
        }
        if( i == grid.length-1 && j == grid[0].length-1){
            return grid[i][j];
        }
        if(dp[i][j] != null)   return dp[i][j];
        int x = solve(i+1,j,grid,dp);
        int y = solve(i,j+1,grid,dp);
        return dp[i][j] = grid[i][j] + Math.min(x,y);
    }
}