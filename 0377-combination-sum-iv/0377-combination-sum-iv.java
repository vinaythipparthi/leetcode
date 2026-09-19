class Solution {
    public int combinationSum4(int[] nums, int target) {
        Integer[] dp = new Integer[target+1];
        return solve(target,nums,dp);
    }
    public int solve(int target, int[] nums, Integer[] dp){
        //base case
        if(target == 0) return 1;
        if(target<0)    return 0;

        if(dp[target] != null)   return dp[target];
        //
        int ans=0;
        for(int val:nums){
            ans += solve(target-val,nums,dp);
        }

        return dp[target] = ans;
    }
}