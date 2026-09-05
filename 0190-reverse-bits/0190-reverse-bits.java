class Solution {
    public int reverseBits(int n) {
        // 32-bit signed integer
        // if you find only bits until n=0 then we miss all trailing zeroes then it leads to other int value!
        String str = "";
        for(int i=0;i<32;i++){
            int digit = n%2;
            str += digit;
            n /= 2;
        }

        int ans=0;
        int x=0;
        for(int i=str.length()-1;i>=0;i--){
            int digit = str.charAt(i)-'0';
            ans += digit*Math.pow(2,x++);
        }
        return ans;
    }
}