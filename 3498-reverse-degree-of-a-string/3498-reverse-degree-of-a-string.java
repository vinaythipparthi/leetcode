class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            ans += Math.abs(((ch-'a'+1)-27))*(i+1);
        }
        return ans;
    }
}