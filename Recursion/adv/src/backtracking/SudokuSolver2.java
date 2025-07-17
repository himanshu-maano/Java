package src.backtracking;

import java.util.Arrays;

public class SudokuSolver2 {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        Solution obj = new Solution();
        obj.solveSudoku(board);
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}

class Solution {
    public void solveSudoku(char[][] board) {
        sudoku(board);
    }

    private boolean sudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isSafe(board, i, j, num)) {
                            board[i][j] = num;
                            if (sudoku(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    private boolean isSafe(char[][] board, int row, int col, char num) {

        for (int i = 0; i < board.length; i++) {
            // checking row
            if (board[row][i] == num) {
                return false;
            }

            // checking column
            if (board[i][col] == num) {
                return false;
            }
        }

        // checking subBox
        int sqrt = (int) Math.sqrt(board.length);
        int r = row - (row % sqrt);
        int c = col - (col % sqrt);
        for (int i = r; i < r + sqrt; i++) {
            for (int j = c; j < c + sqrt; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
