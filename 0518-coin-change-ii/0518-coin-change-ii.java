class Solution {
    public int change(int amount, int[] coins) {
        Integer[][] dp = new Integer[amount+1][coins.length+1];
        return solve(0,amount,coins,dp);
    }
    public int solve(int index, int amount, int[] coins, Integer[][] dp){
        if(amount == 0){
            return 1;
        }
        if(amount < 0 || index >= coins.length){
            return 0;
        }

        if(dp[amount][index] != null)   return dp[amount][index];
        //take
        int take = solve(index, amount-coins[index], coins, dp);
        //skip
        int skip = solve(index+1, amount, coins, dp);
        return dp[amount][index] = take+skip;
    }
}