class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int i=0;
        int j=0;
        while(j < s.length()){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(set.contains(ch2)){
                set.remove(ch1);
                i++;
            }else{
                set.add(ch2);
                j++;
                maxLen = Math.max(maxLen, set.size());
            }
        }
        return maxLen;
    }
}