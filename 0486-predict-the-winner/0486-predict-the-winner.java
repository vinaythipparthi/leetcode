class Solution {
    int[][] dp = new int[23][23];
    public int solve(int i, int j, int[] nums){
        if(i > j)   return 0;
        if(i == j)  return nums[i];

        if(dp[i][j] != -1)  return dp[i][j];
        int take_i = nums[i] + Math.min(solve(i+2,j,nums), solve(i+1,j-1,nums));
        int take_j = nums[j] + Math.min(solve(i,j-2,nums), solve(i+1,j-1,nums));

        dp[i][j] = Math.max(take_i, take_j);
        return dp[i][j];
    }
    public boolean predictTheWinner(int[] nums) {
        for(int[] temp:dp){
            Arrays.fill(temp, -1);
        }
        int i = 0;
        int j = nums.length-1;
        int total_sum = 0;
        for(int val:nums){
            total_sum += val;
        }

        int player1 = solve(i,j,nums);
        int player2 = total_sum - player1;

        return player1 >= player2;
    }
}