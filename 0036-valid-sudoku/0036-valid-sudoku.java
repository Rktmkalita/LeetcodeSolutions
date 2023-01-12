class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check rows
        for (char[] row : board) {
            if (!checkValid(row)) {
                return false;
            }
        }
        // check columns
        for (int col = 0; col < board[0].length; col++) {
            char[] column = new char[board.length];
            for (int row = 0; row < board.length; row++) {
                column[row] = board[row][col];
            }
            if (!checkValid(column)) {
                return false;
            }
        }
        // check 3x3 sub-grids
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                char[] grid = new char[9];
                int k = 0;
                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < j + 3; col++) {
                        grid[k++] = board[row][col];
                    }
                }
                if (!checkValid(grid)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkValid(char[] lst) {
        // check if list contains 1-9 without repetition
        boolean[] seen = new boolean[9];
        for (char c : lst) {
            if (c != '.') {
                int index = c - '1';
                if (seen[index]) {
                    return false;
                }
                seen[index] = true;
            }
        }
        return true;
    }
}