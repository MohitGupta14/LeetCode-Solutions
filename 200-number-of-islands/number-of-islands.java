class Solution {
    int ans = 0;

    public int numIslands(char[][] grid) {
         if (grid == null || grid.length == 0) {
            return 0;
        }
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    ans++;
                }
            }
        }

        return  ans;
    }

    public void dfs(char[][] grid ,int row , int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0'; 
        dfs(grid, row-1, col);
        dfs(grid, row, col-1);
        dfs(grid, row+1, col);
        dfs(grid, row, col+1);

    }
}
