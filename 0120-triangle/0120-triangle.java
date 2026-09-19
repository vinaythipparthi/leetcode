class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] dp = new Integer[201][202];
        return solve(0,0,triangle, dp);
    }
    public int solve(int row, int i, List<List<Integer>> triangle, Integer[][] dp){
        //base case
        if(row == triangle.size() || i == triangle.get(i).size()){
            // return Integer.MAX_VALUE;
            return 0;
        }

        if(dp[row][i] != null)  return dp[row][i];
        int x = solve(row+1, i, triangle, dp);
        int y = solve(row+1, i+1, triangle, dp);

        return dp[row][i] = triangle.get(row).get(i) + Math.min(x, y);
    }
}