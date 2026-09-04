class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // ans = (max(0 to i) - min(i to n-1) <= k)
        int n = nums.length;
        int[] maxArr = new int[n];
        int[] minArr = new int[n];
        maxArr[0] = nums[0];
        minArr[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            //nums = 5,0,1,4
            //maxArr = 5,5,5,5
            //minArr = 0,0,1,4
            maxArr[i] = Math.max(maxArr[i-1], nums[i]);
            minArr[n-i-1] = Math.min(minArr[n-i], nums[n-i-1]);
        }
        //
        // int minIndex = -1;
        // int minInst = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int instVal = maxArr[i] - minArr[i];
            if(instVal <= k){
                return i;
            }
        }
        return -1;
    }
}