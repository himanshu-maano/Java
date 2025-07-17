package src.backtracking.ApnaClg;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 0, 1, 1, 1 },
                { 1, 0, 0, 1 }
        };

        int[][] path = new int[maze.length][maze[0].length];

        ratWaysStep(maze, 0, 0, "", path, 1);
    }

    static void ratWays(int[][] maze, int row, int col, String path) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        if (maze[row][col] == 0) {
            return;
        }

        maze[row][col] = 0;

        if (row < maze.length - 1) {
            ratWays(maze, row + 1, col, path + "D");
        }
        if (col < maze[0].length - 1) {
            ratWays(maze, row, col + 1, path + "R");
        }
        if (row > 0) {
            ratWays(maze, row - 1, col, path + "U");
        }
        if (col > 0) {
            ratWays(maze, row, col - 1, path + "L");
        }

        maze[row][col] = 1;
    }

    static void ratWaysStep(int[][] maze, int row, int col, String path, int[][] pathWay, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            pathWay[row][col] = step;
            displayWays(pathWay);
            System.out.println(path);

            pathWay[row][col] = 0;
            return;
        }

        if (maze[row][col] == 0) {
            return;
        }

        maze[row][col] = 0;

        pathWay[row][col] = step;

        if (row < maze.length - 1) {
            ratWaysStep(maze, row + 1, col, path + "D", pathWay, step + 1);
        }
        if (col < maze[0].length - 1) {
            ratWaysStep(maze, row, col + 1, path + "R", pathWay, step + 1);
        }
        if (row > 0) {
            ratWaysStep(maze, row - 1, col, path + "U", pathWay, step + 1);
        }
        if (col > 0) {
            ratWaysStep(maze, row, col - 1, path + "L", pathWay, step + 1);
        }

        maze[row][col] = 1;

        pathWay[row][col] = 0;
    }

    private static void displayWays(int[][] pathWay) {
        System.out.println("--------Rat-Ways--------");
        for (int[] row : pathWay) {
            for(int step : row) {
                System.out.print(step + " ");
            }
            System.out.println();
        }
    }
}
