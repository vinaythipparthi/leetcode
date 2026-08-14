class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        int fresh = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        //
        if(fresh == 0) return 0;
        //
        int minutes = 0;
        while(!q.isEmpty() && fresh > 0){
            int size = q.size();
            minutes++;
            while(size != 0){
                int[] arr = q.poll();
                int i = arr[0];
                int j = arr[1];
                size--;
                //left
                if(j-1>=0 && grid[i][j-1] == 1){
                    q.offer(new int[]{i,j-1});
                    grid[i][j-1] = 2;
                    fresh--;
                }
                //right
                if(j+1<m && grid[i][j+1] == 1){
                    q.offer(new int[]{i,j+1});
                    grid[i][j+1] = 2;
                    fresh--;
                }
                //up
                if(i-1>=0 && grid[i-1][j] == 1){
                    q.offer(new int[]{i-1,j});
                    grid[i-1][j] = 2;
                    fresh--;
                }
                //down
                if(i+1<n && grid[i+1][j] == 1){
                    q.offer(new int[]{i+1,j});
                    grid[i+1][j] = 2;
                    fresh--;
                }
            }
        }
        return fresh == 0 ? minutes:-1;
    }
}