class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer[] dp = new Integer[amount+1];
        int ans = solve(amount, coins, dp);
        if(ans == Integer.MAX_VALUE)  return -1;
        return ans;
    }
    public int solve(int amount, int[] coins, Integer[] dp){
        //base case
        if(amount == 0) return 0;
        if(amount < 0 ) return Integer.MAX_VALUE;


        if(dp[amount] != null)  return dp[amount];
        //call
        int ans = Integer.MAX_VALUE;
        for(int coin:coins){
            int result = solve(amount - coin, coins, dp);
            if(result != Integer.MAX_VALUE){
                ans = Math.min(ans, result+1);
            }
        }
        return dp[amount] = ans;
    }
}