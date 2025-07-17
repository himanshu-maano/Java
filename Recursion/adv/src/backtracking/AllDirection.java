package src.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllDirection {
    static ArrayList<String> mazeAllPathbacktrack(String p, boolean[][] maze, int r, int c) {
        if ((r == maze.length - 1) && (c == maze[0].length - 1)) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (!maze[r][c]) {
            return ans;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            ans.addAll(mazeAllPathbacktrack(p + "D", maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            ans.addAll(mazeAllPathbacktrack(p + "R", maze, r, c + 1));
        }
        if (r > 0) {
            ans.addAll(mazeAllPathbacktrack(p + "U", maze, r - 1, c));
        }
        if (c > 0) {
            ans.addAll(mazeAllPathbacktrack(p + "L", maze, r, c - 1));
        }

        maze[r][c] = true;

        return ans;
    }


    static void mazeAllPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if ((r == maze.length - 1) && (c == maze[0].length - 1)) {
            path[r][c] = step;
            for(int[] track : path) {
                System.out.println(Arrays.toString(track));
            }
            System.out.println(p);
            System.out.println();
            path[r][c] = 0;
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        path[r][c] = step;

        if (r < maze.length - 1) {
            mazeAllPathPrint(p + "D", maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            mazeAllPathPrint(p + "R", maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            mazeAllPathPrint(p + "U", maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            mazeAllPathPrint(p + "L", maze, r, c - 1, path, step + 1);
        }

        maze[r][c] = true;

        path[r][c] = 0;
    }

    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, false },
                { true, true, true },
                { true, true, true }
        };

        // ArrayList<String> list = mazeAllPathbacktrack("", maze, 0, 0);
        // System.out.println(list);

        int[][] path = new int[maze.length][maze[0].length];
        mazeAllPathPrint("", maze, 0, 0, path, 1);
    }
}
