package src.backtracking.ApnaClg;

public class Nqueens {
    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'x';
            }
        }

        // System.out.println("\n" +"Number of ways to place Quuen : " + nQueen(board, 0));
        
        if(!nQueen1(board, 0)) {
            System.out.println("No valid ways to place queens...");
        } else {
            System.out.println("Solution is possible...");
            displayBoard(board);
        }
    }

    static int nQueen(char[][] board, int row) {
        if(row == board.length) {
            displayBoard(board);
            return 1;
        }

        int ways = 0;

        for(int j=0; j<board.length;j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                ways += nQueen(board, row + 1);
                board[row][j] = 'x';
            }
        }

        return ways;
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        for(int i=0; i<row; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        for(int i=row-1, j=col+1; i>=0 && j<board[0].length; i--,j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    } 

    static boolean nQueen1(char[][] board, int row) {
        if(row == board.length) {
            return true;
        }


        for(int j=0; j<board.length;j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueen1(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x';
            }
        }

        return false;
    }

    static void displayBoard(char[][] board) {
        System.out.println("---------chessboard----------");
        for(char[] rows : board) {
            for(char ch : rows) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
