class Solution {
    public boolean uniformArray(int[] nums1) {
        //find min element
        // If min element is odd we can change entire array elements into odd elements
        int n = nums1.length;
        int minVal = Integer.MAX_VALUE;
        for(int val:nums1){
            minVal = Math.min(minVal, val);
        }
        if((minVal&1) == 1)   return true;
        
        //if all elements having same parity
        boolean flag = true;
        for(int i=0;i<n;i++){
            int val = nums1[i];
            if((val&1) != (nums1[0]&1)){
                flag = false;
                break;
            }
        }
        if(flag)    return true;
        return false;
    }
}