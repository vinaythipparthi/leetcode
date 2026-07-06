class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        for(int interval[]:intervals){
            int a = interval[0];
            int b = interval[1];
            boolean flag = true;
            for(int k[]:intervals){
                if(Arrays.equals(k,interval))    continue;
                int c = k[0];
                int d = k[1];
                if(c<=a && b<=d){
                    flag = false;
                    break;
                }
            }
            if(flag)    count++;
        }
        return count;
    }
}