class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int x=0;x<s1.length();x++){
            char ch = s1.charAt(x);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        //
        for(int i=0;i<s2.length();i++){
            HashMap<Character, Integer> map1 = new HashMap<>();
            for(int j=i;j<i+s1.length() && j<s2.length();j++){
                char ch = s2.charAt(j);
                map1.put(ch, map1.getOrDefault(ch,0)+1);
            }

            //compare 
            if(map.equals(map1))  return true;
        }
        return false;
    }
}