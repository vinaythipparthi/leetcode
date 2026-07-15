class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i=1;i<=n+n;i++){
            if((i&1)==1)    sumOdd += i;
            else    sumEven += i;
        }
        //Euclidean Algorithm
        while(sumEven!=0){
            int temp = sumEven;
            sumEven = sumOdd%sumEven;
            sumOdd = temp;
        }
        return sumOdd;
    }
}