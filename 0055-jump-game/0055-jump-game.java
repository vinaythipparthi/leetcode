class Solution {
    public boolean canJump(int[] nums) {
        //Recursion + dp
        Boolean[] dp = new Boolean[nums.length];
        return solve(0, nums.length, nums, dp);
    }
    public boolean solve(int idx, int n, int[] nums, Boolean[] dp){
        if(idx >= n-1){
            return true;
        }

        if(dp[idx] != null){
            return dp[idx];
        }
        for(int i=1;i<=nums[idx];i++){
            if(solve(idx+i, n, nums, dp)){
                return dp[idx] = true;
            }
        }
        return dp[idx] = false;
    }
}