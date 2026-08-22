class Solution {
    int digitSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n%10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
    int digitProduct(int n){
        int product = 1;
        while(n > 0){
            int digit = n%10;
            product *= digit;
            n /= 10;
        }
        return product;
    }
    public boolean checkDivisibility(int n) {
        return n % (digitSum(n) + digitProduct(n)) == 0 ? true : false;
    }
}