class Solution {
    public int uniquePaths(int m, int n) {

        return toFinish(0, 0, m, n);
        
    }

  // this solution is not optimized as it has exponential time complexilty - O(2^n+m)
  
  
    public int toFinish(int row, int col, int m, int n) {
        // base condition 
        if(row == m-1 && col == n-1) {
            // robot is at the finish point
            return 1;
        } else if(row == m || col == n) {
          // now at this point the robot is either at right end or down end (crossed the boundary)
            return 0;
        }

        int way1 = toFinish(row+1, col, m, n);
        int way2 = toFinish(row, col+1, m, n);
        return way1 + way2;

    }
}
