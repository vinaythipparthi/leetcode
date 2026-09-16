class Solution {
    public int minCostClimbingStairs(int[] cost) {
        Integer[] dp = new Integer[cost.length+1];
        int x=minCost(0,cost,dp);
        int y=minCost(1,cost,dp);
        return Math.min(x,y);
    }
    public int minCost(int ind, int[] cost, Integer[] dp){
        //base case
        if(ind >= cost.length){
            return 0;
        }
        //if the value occurs again return it
        if(dp[ind] != null) return dp[ind];
        //call
        int x = minCost(ind+1,cost,dp);
        int y = minCost(ind+2,cost,dp);
        //store the value
        dp[ind] = cost[ind] + Math.min(x,y);

        return dp[ind];
    }
}