package src.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(maze(2, 2));
        // mazePath("",2, 2);
        boolean[][] maze = {
                { true, true, true },
                { false, true, true },
                { true, true, true }
        };

        ArrayList<String> list = mazePathObstacle("", maze, 0, 0);
        System.out.println(list);
    }

    static int maze(int r, int c) {
        if (r == 0 || c == 0) {
            return 1;
        }

        int down = maze(r - 1, c);
        int right = maze(r, c - 1);

        return down + right;
    }

    static void mazePath(String p, int r, int c) {
        if (r == 0 && c == 0) {
            System.out.println(p);
            return;
        }

        if (r > 0) {
            mazePath(p + "D", r - 1, c);
        }
        if (c > 0) {
            mazePath(p + "R", r, c - 1);
        }
    }

    static ArrayList<String> mazePathRet(String p, int r, int c) {
        if (r == 0 && c == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 0) {
            ans.addAll(mazePathRet(p + "D", r - 1, c));
        }
        if (c > 0) {
            ans.addAll(mazePathRet(p + "R", r, c - 1));
        }

        return ans;
    }

    static ArrayList<String> mazePathDigRet(String p, int r, int c) {
        if (r == 0 && c == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 0 && c > 0) {
            ans.addAll(mazePathDigRet(p + "D", r - 1, c - 1));
        }
        if (r > 0) {
            ans.addAll(mazePathDigRet(p + "V", r - 1, c));
        }
        if (c > 0) {
            ans.addAll(mazePathDigRet(p + "H", r, c - 1));
        }

        return ans;
    }

    static ArrayList<String> mazePathObstacle(String p, boolean[][] maze, int r, int c) {
        if ((r == maze.length - 1) && (c == maze[0].length - 1)) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (!maze[r][c]) {
            return ans;
        }

        if (r < maze.length - 1) {
            ans.addAll(mazePathObstacle(p + "D", maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            ans.addAll(mazePathObstacle(p + "R", maze, r, c + 1));
        }

        return ans;
    } 
}
