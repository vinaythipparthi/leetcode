import java.util.*;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1; 
        int high= position[position.length-1];
        int ans = 0;

        while (low <= high){
            int mid =low+(high - low) / 2;
            if (solve(position, mid, m)) {
                ans =mid;  
                low = mid +1;
            } else {
                high = mid - 1; 
            }
        }
        return ans;
    }

    private boolean solve(int[] arr, int m, int balls) {
        int count = 1;
        int lastPos = arr[0];
        for (int i = 1;i<arr.length; i++) {
            if (arr[i]-lastPos >= m) {
                count++;
                lastPos=arr[i];
                if (count==balls) return true;
            }
        }
        return false;
    }
}