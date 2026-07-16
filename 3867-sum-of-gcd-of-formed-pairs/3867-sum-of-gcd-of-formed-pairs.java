class Solution {
    public int euclideanAlgo(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = Math.max(prefix[i-1],nums[i]);
        }
        //
        int[] prefixGcd = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            prefixGcd[i] = euclideanAlgo(nums[i],prefix[i]);
        }
        Arrays.sort(prefixGcd);
        //
        int i = 0;
        int j = prefixGcd.length-1;
        long sum = 0;
        while(i<j){
            //
            int a = prefixGcd[i];
            int b = prefixGcd[j];
            sum += euclideanAlgo(a,b);

            i++;
            j--;
        }
        return sum;
    }
}