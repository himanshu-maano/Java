package src.backtracking;

public class TOWEROFHANOI {
    public static void main(String[] args) {
        toh(4, 1, 2, 3);    
    }

    static void toh(int n, int s, int h, int d) {
        // A -> C (nth disk)
        if(n == 1) {
            System.out.println(s + "->" + d);
            return;
        }

        // A -> B using C (n-1 disk)
        toh(n-1, s, d, h);
        System.err.println(s + "->" + d);

        // B -> C using A
        toh(n-1, h, s, d);
    }
}
