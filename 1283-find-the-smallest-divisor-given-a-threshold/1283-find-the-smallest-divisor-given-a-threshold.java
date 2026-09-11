class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int val:nums){
            max = Math.max(val, max);
        }
        int ans=max;
        int low=1;
        int high=max;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(findSum(nums,mid) <= threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int findSum(int[] nums, int divisor){
        int sum=0;
        for(int val:nums){
            sum += Math.ceil((double)val/divisor);
        }
        return sum;
    }
}