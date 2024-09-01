package Pattern;

public class invert_halfPyramidNum {

    public static void half_PyramidNum (int n) {
        // rows
        for(int i=1; i<=n; i++) {
            // columns numbers
            for(int j=1; j<=n+1-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        half_PyramidNum(5);
    }
}
