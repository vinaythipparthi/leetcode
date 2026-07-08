class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        String str = Integer.toString(n);
        for(int i=0;i<str.length();i++){
            int digit = str.charAt(i)-'0';
            if(digit!=0){
                x = x*10 + digit;
                sum += digit;
            }
        }
        return (long)(x*sum);
    }
}