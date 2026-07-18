class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int waterUnits = 0;
        while(i<j){
            leftMax = Math.max(leftMax, arr[i]);
            rightMax = Math.max(rightMax, arr[j]);
            int minLevel = Math.min(leftMax, rightMax);
            if(leftMax <= rightMax){
                waterUnits += minLevel-arr[i];
                i++;
            }else{
                waterUnits += minLevel-arr[j];
                j--;
            }
        }
        return waterUnits;
    }
}