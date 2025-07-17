package src.backtracking.ApnaClg;

public class GridWays {
    public static void main(String[] args) {
        System.out.println(gridWays(0, 0, 3, 3));
    }
     
    // time complexity -> O(2^n*m) 
    static int gridWays(int r, int c, int n, int m) {
        if(r == n-1 || c == m-1) {
            return 1;
        }

        int right = gridWays(r, c + 1, n, m);

        int down = gridWays(r + 1, c, n, m);

        return right + down;
    }
}
