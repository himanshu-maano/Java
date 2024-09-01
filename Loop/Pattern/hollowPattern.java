package Pattern;
import java.util.Scanner;

public class hollowPattern {
    public static void hollow_Rectangle (int totRows, int totCols) {
        // outer loop
        for(int i=1; i<=totRows; i++) {
            // column loop
            for(int j=1; j<=totCols; j++) {
                // boundary condition or cell (i, j) 
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cell
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input rows : ");
        int totRow = sc.nextInt();
        System.out.print("Input columns : ");
        int totCols = sc.nextInt();
        hollow_Rectangle(totRow, totCols);
        sc.close();
    }
}
