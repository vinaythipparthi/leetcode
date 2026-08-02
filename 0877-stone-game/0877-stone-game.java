class Solution {
    public boolean stoneGame(int[] piles) {
        int[][] dp = new int[piles.length][piles.length];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        //
        int total_piles = 0;
        for(int val:piles){
            total_piles += val;
        }
        int alice_piles = solve(0, piles.length-1, piles, dp);
        int bob_piles = total_piles - alice_piles;
        return alice_piles >= bob_piles;
    }
    public int solve(int i, int j, int[] nums, int[][] dp){
        //base case
        if(i == j)    return nums[i];
        if(i > j)     return 0;

        //
        if(dp[i][j] != -1)  return dp[i][j];
        int take_i = nums[i] + Math.min(solve(i+2,j,nums,dp), solve(i+1,j-1,nums,dp));
        int take_j = nums[j] + Math.min(solve(i,j-2,nums,dp),solve(i+1,j-1,nums,dp));

        dp[i][j] = Math.max(take_i, take_j);
        return dp[i][j];
    }
}