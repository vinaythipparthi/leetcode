class Solution {
    public boolean canPartition(int[] nums) {
        int total_sum = 0;
        for(int val:nums){
            total_sum += val;
        }
        // if total sum is odd value then we cannot find equal subsets
        // [1,2,3,5] -> sum is 11 -> 11/2 = 5
        // total sum - 5 = 6. So one subset is 6 and other is 5 not equal!
        if((total_sum & 1) == 1)    return false;
        int target = total_sum/2;
        Boolean[][] dp = new Boolean[target+1][nums.length+1];
        return solve(0,target,nums,dp);
    }
    public boolean solve(int index, int target, int[] nums, Boolean[][] dp){
        //base case
        if(target == 0) return true;
        if(target < 0 || index == nums.length)  return false;

        if(dp[target][index] != null)   return dp[target][index];
        //take
        boolean take = solve(index+1, target-nums[index], nums,dp);
        //skip
        boolean skip = solve(index+1, target, nums,dp);

        return dp[target][index] = take || skip;
    }
}