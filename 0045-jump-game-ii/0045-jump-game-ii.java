class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        Integer[] dp = new Integer[n+1];
        return solve(0,n,nums,dp);
    }
    public int solve(int index, int n, int[] nums, Integer[] dp){
        if(index == n-1)  return 0;

        if(dp[index] != null)   return dp[index];
        int minCost = 10001;
        for(int i=1;i<=nums[index];i++){
            if(index + i < n){
                int res = 1 + solve(index+i, n, nums, dp);
                minCost = Math.min(res, minCost);
            }
        }
        return dp[index] = minCost;
    }
}