package Pattern;

public class diamond_Pattern {
    
    public static void diamondPattern (int n) {
        // 1st half outer loop i->1 to n
        for(int i=1; i<=n; i++) {
            // spaces - n-i
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // stars - 2*i-1
            // for odd -> 2*x-1 || 2*x+1
            
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half outer loop i-> n to 1
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondPattern(4 );
    }
}
