class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)    return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int maxCount = 1;
        int count = 1;
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            //
            if(nums[i]+1 == nums[i+1]){
                count++;
            }else
            {
                count=1;
            }
            maxCount = Math.max(maxCount, count);
                
        }
        return maxCount;
    }
}