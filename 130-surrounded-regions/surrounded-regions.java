class Solution {
    public void solve(char[][] board) {
        int Rows = board.length;
        int Cols = board[0].length;

        for (int i = 0; i < Cols; i++) {
            if (board[0][i] == 'O') dfs(board, 0, i);
            if (board[Rows - 1][i] == 'O') dfs(board, Rows - 1, i);
        }

    
        for (int i = 0; i < Rows; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][Cols - 1] == 'O') dfs(board, i, Cols - 1);
        }

        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == 'T') board[i][j] = 'O';
            }
        }
    }

    private void dfs(char[][] board, int r, int c) {
        int nRows = board.length;
        int nCols = board[0].length;
        if (
            r < 0 || c < 0 || r >= nRows || c >= nCols || board[r][c] != 'O'
        ) return;

        board[r][c] = 'T';
        dfs(board, r + 1, c);
        dfs(board, r - 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
    }
    
}