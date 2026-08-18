class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(k==n){
            int ans = -1;
            for(int val:nums){
                ans = Math.max(ans, val);
            }
            return ans;
        }
        int[] freq = new int[51];
        for(int val:nums){
            freq[val]++;
        }
        if(k==1){
            //find largest which occurs once
            for(int i=50;i>0;i--){
                if(freq[i] == 1)    return i;
            }
            return -1;
        }
        int res = -1;
        if(freq[nums[0]] == 1)    res = Math.max(res, nums[0]);
        if(freq[nums[n-1]] == 1)    res = Math.max(res, nums[n-1]);
        return res;
    }
}