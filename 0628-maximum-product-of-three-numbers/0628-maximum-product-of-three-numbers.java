class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        //
        for(int i=0;i<n;i++){
            int val = nums[i];

            //find maxes
            if(max1 <= val){
                max3 = max2;
                max2 = max1;
                max1 = val;
            }else if(max2 <= val){
                max3 = max2;
                max2 = val;
            }else if(max3 < val){
                max3 = val;
            }

            //find mins
            if(min1 >= val){
                min2 = min1;
                min1 = val;
            }else if(min2 > val){
                min2 = val;
            }
        }
        //Find max of min&max
        int ans = Math.max(max1*max2*max3, min1*min2*max1);
        return ans;
    }
}