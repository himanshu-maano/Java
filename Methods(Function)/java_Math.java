import java.util.Scanner;

public class java_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer : ");
        double m = sc.nextDouble();
        double n = sc.nextDouble();
        System.out.println("|" + n + "| is " + Math.abs(m));
        System.out.println("Minimum is " + Math.min(2, 5));
        System.out.println("Maximum is " + Math.max(7, 0));
        System.out.println("Square root is " + Math.sqrt(16));
        System.out.println("Cube root is " + Math.cbrt(27));
        System.out.println("2 power 5 is " + Math.pow(2, 5));

        sc.close();
    }
}
