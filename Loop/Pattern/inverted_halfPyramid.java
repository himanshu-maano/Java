package Pattern;

public class inverted_halfPyramid {
    public static void halfPyramid ( int totline) {
        // outer loop for rows
        for(int i = 1; i <= totline; i++) {
            // for spaces 
            for(int j = 1; j <= totline-i; j++) {
                System.out.print(" ");
            }
            // for stars
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        halfPyramid(4);
    }
}
