class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int m = intervals[0].length;
        int count = 0;
        for(int interval[]:intervals){
            int a = interval[0];
            int b = interval[1];
            boolean flag = true;
            for(int k[]:intervals){
                int c = k[0];
                int d = k[1];
                if(a==c && b==d)    continue;
                if(c<=a && b<=d){
                    flag = false;
                }
            }
            if(flag)    count++;
        }
        return count;
    }
}