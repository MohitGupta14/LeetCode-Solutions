class Solution {
    int ans = 0 ;
    public int maxAreaOfIsland(int[][] grid) {
         int temp= 0;
        for(int i = 0 ; i < grid.length ;i++){
            for(int j = 0; j< grid[0].length ;j++){
                if(grid[i][j] == 1){
                    ans = 0;
                    dfs(grid, i ,j);
                    temp = Math.max(ans, temp) ;
                }
            }
        }

        return temp;
    }

    public void dfs(int[][] grid , int row , int col){
        int rows = grid.length;
        int cols = grid[0].length;
        
        if(row >= rows || col >= cols || row < 0 || col < 0 || grid[row][col] == 0 ){
            return;
        }
        ans++;
        grid[row][col] = 0 ;
        dfs(grid, row-1 ,col);
        dfs(grid, row ,col-1);
        dfs(grid, row+1 ,col);
        dfs(grid, row ,col+1);

    }
}