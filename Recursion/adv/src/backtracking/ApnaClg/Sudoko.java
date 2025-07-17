package src.backtracking.ApnaClg;

public class Sudoko {
    public static void main(String[] args) {
        int[][] sudoku = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exist...");
            displaySudoku(sudoku);
        } else {
            System.out.println("Solution not exist...");
        }
    }

    static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        if (row == sudoku.length) {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;

        if (col + 1 == sudoku[0].length) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int num) {
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][col] == num) {
                return false;
            }
            if (sudoku[row][i] == num) {
                return false;
            }
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void displaySudoku(int[][] sudoku) {
        for (int[] row : sudoku) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
