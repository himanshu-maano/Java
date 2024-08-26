import java.util.Scanner;

public class halfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int n = sc.nextInt();
        for(int lines=1; lines<=n; lines++) { //num of lines
            for(int num=1; num<=lines; num++) { //print number
                System.out.print(num  + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
