class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = -1;

        int max = Integer.MIN_VALUE;

        for(int num : piles){
            max = Math.max(num, max);
        }

        int left = 1, right = max;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(isEating(piles, h, mid)){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return ans;
    }

    public boolean isEating(int[] piles, int h, int mid){
        long hrs = 0;
        for(int i=0; i<piles.length; i++){
            hrs += Math.ceil((double)piles[i] / mid);
        }

        if(hrs <= h) return true;
        return false;
    }
}