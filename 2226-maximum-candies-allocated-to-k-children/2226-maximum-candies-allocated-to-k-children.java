class Solution {
    public int maximumCandies(int[] candies, long k) {
        //range
        int low=1;
        int high=0;
        for(int val:candies){
            high = Math.max(high, val);
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            //
            if(checkCandies(candies,k,mid)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public boolean checkCandies(int[] candies, long k, int pileOfCandies){
        //
        long res = 0;
        for(int candy:candies){
            res += candy/pileOfCandies;
        }
        return res >= k;
    }
}