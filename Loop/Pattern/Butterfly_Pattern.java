package Pattern;

public class Butterfly_Pattern {
    public static void butterfly (int m) {
        // first half
        for(int i=1; i<=m; i++) {
            // stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            
            // spaces - 2*(n-i)
            for(int j=1; j<=(2*(m-i)); j++) {
                System.out.print(" ");
            }

            // stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        // for mirror image 
        // reverse the outer loop

        for(int i=m; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=(2*(m-i)); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(5);
    }
}
