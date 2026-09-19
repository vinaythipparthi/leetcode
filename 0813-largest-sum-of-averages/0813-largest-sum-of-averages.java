class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        Double[][] dp = new Double[nums.length+1][k+1];
        return solve(0,k,nums,dp);
    }
    public double solve(int index, int k, int[] nums, Double[][] dp){
        if(k == 1){
            double sum = 0;
            for(int i=index;i<nums.length;i++){
                sum += nums[i];
            }
            double avg = sum/(nums.length-index);
            return avg;
        }

        if(dp[index][k] != null)    return dp[index][k];
        double ans=0;
        double sum=0;
        for(int i=index;i<=nums.length-k;i++){
            sum += nums[i];
            double avg = sum/(i-index+1);
            double next = solve(i+1, k-1, nums, dp);
            ans = Math.max(ans, avg+next);
        }
        return dp[index][k] = ans;
    }
}