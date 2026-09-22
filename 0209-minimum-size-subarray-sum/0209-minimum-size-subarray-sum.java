class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i=0;
        int sum=0;
        int minSize=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            sum += nums[j];
            while(sum >= target){
                minSize = Math.min(minSize, j-i+1);
                sum -= nums[i];
                i++;
            }
        }
        return minSize == Integer.MAX_VALUE?0:minSize;
    }
}