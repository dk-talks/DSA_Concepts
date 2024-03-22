class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int islandCount = 0;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(grid[i][j] == '1') {
                    dfs(grid, i, j);
                    islandCount++;
                }
            }
        }    

        return islandCount;
    }

    public void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        int n = grid.length;
        int m = grid[0].length;
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};

        for(int k = 0; k<4; k++) {
            int ni = i+dx[k];
            int nj = j+dy[k];

            if(ni >= 0 && nj >= 0 && ni<n && nj<m && grid[ni][nj] == '1') {
                dfs(grid, ni, nj);
            }
        }
    }


}
