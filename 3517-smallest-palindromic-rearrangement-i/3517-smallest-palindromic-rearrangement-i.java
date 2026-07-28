class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(int i=0;i<n/2;i++){
            freq[s.charAt(i) - 'a']++;
        }
        StringBuilder left = new StringBuilder();
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i];j++){
                left.append((char)('a'+i));
            }
        }
        String mid = "";
        if((n&1)==1){
            mid += s.charAt(n/2);
        }
        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + mid + right;
    }
}