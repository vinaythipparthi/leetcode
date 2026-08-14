class Solution {
    public int maximumLengthSubstring(String s) {
        int ans = 0;
        int i = 0;
        int j = 0;
        int[] freq = new int[26];
        while(j<s.length()){
            char ch = s.charAt(j);
            freq[ch-'a']++;
            while(freq[ch-'a'] > 2){
                freq[s.charAt(i) - 'a']--;
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}