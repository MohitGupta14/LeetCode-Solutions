import java.util.Queue;
import java.util.LinkedList;

class Solution {
    int ans = 0;

    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }
        
        BFS(grid, q);
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    return -1; // There are still fresh oranges, can't rot them all.
                }
            }
        }
        
        return ans;
    }

    public void BFS(int[][] grid, Queue<int[]> q) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!q.isEmpty()) {
            int size = q.size();
            boolean changed = false;
            
            for (int i = 0; i < size; i++) {
                int[] coords = q.poll();
                int row = coords[0];
                int col = coords[1];
                
                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    
                    if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        q.offer(new int[]{newRow, newCol});
                        changed = true;
                    }
                }
            }
            
            if (changed) {
                ans++;
            }
        }
    }
}
