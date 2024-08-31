import java.util.Scanner;

public class factorial {

    public static int Factorial(int a) {
        int product = 1;
        for(int i=1; i<=a; i++) {
            product *= i;
        }
        return product;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);
        int binCoeff = fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        System.out.println("Combination is " + binCoeff(n, r));
        sc.close();
    }
}
