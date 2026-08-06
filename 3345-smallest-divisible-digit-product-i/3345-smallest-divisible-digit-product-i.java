class Solution {
    public int productOfDigits(int num){
        int ans = 1;
        while(num >= 1){
            int digit = num%10;
            ans *= digit;
            num /= 10;
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
        int smallNum = 0;
        for(int num=n;num<=100;num++){
            int res = productOfDigits(num);
            if(res%t == 0){
                smallNum = num;
                break;
            }
        }
        return smallNum;
    }
}