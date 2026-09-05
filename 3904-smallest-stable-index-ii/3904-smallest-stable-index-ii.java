class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] sufix = new int[n];
        prefix[0] = nums[0];
        sufix[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            prefix[i] = Math.max(prefix[i-1], nums[i]);
            sufix[n-i-1] = Math.min(sufix[n-i], nums[n-i-1]);
        }
        //
        // int minInd = -1;
        // int minInst = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int instVal = prefix[i]-sufix[i];
            if(instVal <= k){
                // minInd = i;
                // minInst = Math.min(minInst, instVal);
                return i;
            }
        }
        // return minInd;
        return -1;
    }
}