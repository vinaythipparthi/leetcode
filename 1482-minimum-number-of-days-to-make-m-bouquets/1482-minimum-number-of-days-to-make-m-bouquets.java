class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=1;
        int high=0;
        for(int val:bloomDay){
            high = Math.max(high, val);
        }
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(checkDays(bloomDay,m,k,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean checkDays(int[] bloomDay, int m, int k, int bloomedDay){
        int adjK = 0;
        int bouquets = 0;
        for(int val:bloomDay){
            if(val <= bloomedDay){
                adjK++;
            }
            else{
                adjK=0;
            }
            if(adjK == k){
                bouquets++;
                adjK=0;
            }
        }
        return bouquets >= m;
    }
}