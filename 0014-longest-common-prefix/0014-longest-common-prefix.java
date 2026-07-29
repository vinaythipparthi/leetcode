class Solution {
    public String longestCommonPrefix(String[] strs) {
        //find smallest length str
        String smallStr = "";
        int len = 200;
        int index = 0;
        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            int size = str.length();
            if(len > size){
                len = size;
                smallStr = str;
                index = i;
            }
        }
        //compare smallest string prefixes with other strings prefixes
        int count = 0;
        String ans = "";
        for(int x=0;x<len;x++){
            char ch = smallStr.charAt(x);
            boolean flag = false;
            
            for(int i=0;i<strs.length;i++){
                //
                if(i == index)  continue;
                char prefixCh = strs[i].charAt(x);
                if(ch != prefixCh){
                    flag = true;
                    break;
                }
            }
            if(flag)    break;
            count++;
            ans += ch;
        }
        //
        return ans;
    }
}