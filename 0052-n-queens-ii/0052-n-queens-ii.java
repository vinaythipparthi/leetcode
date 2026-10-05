class Solution {
    public int totalNQueens(int n) {
        return solve(0,n,new boolean[n],new boolean[2 * n - 1],
                        new boolean[2 * n - 1]);
    }
    private int solve(int row, int n,
                      boolean[] columns,
                      boolean[] diagonals1,
                      boolean[] diagonals2) {
        // All queens are placed
        if (row == n) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < n; col++) {
            int diagonal1 = row - col + n - 1;
            int diagonal2 = row + col;
            // Position is already attacked
            if (columns[col] || diagonals1[diagonal1] || diagonals2[diagonal2]) {
                continue;
            }
            // Place queen
            columns[col]=true;
            diagonals1[diagonal1]=true;
            diagonals2[diagonal2]= true;
            // Move to next row
            count += solve(row+1,n,
                           columns,diagonals1,diagonals2);

            // Backtrack
            columns[col] =false;
            diagonals1[diagonal1]=false;
            diagonals2[diagonal2]=false;
        }

        return count;
    }
}