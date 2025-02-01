class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                if (num != '.') { // Ignore empty cells
                    if (!seen.add(num + " in row " + i) ||
                        !seen.add(num + " in col " + j) ||
                        !seen.add(num + " in box " + i / 3 + "-" + j / 3)) {
                        return false; // Duplicate found
                    }
                }
            }
        }

        return true;
    }
}
