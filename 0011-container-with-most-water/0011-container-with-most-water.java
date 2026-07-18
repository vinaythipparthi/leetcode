class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int leftMax = 0;
        int rightMax = 0;
        int mostWater = 0;
        while(i<j){
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);
            int minHeight = Math.min(leftMax, rightMax);
            //mostWater = width*height
            // width = rightBoundary-leftBoundary
            int width = j-i;
            int waterLevel = width*minHeight;
            mostWater = Math.max(mostWater, waterLevel);
            
            if(leftMax <= rightMax){
                i++;
            }else{
                j--;
            }
        }
        return mostWater;
    }
}