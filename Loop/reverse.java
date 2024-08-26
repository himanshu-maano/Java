import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num : ");
        int n = sc.nextInt();
        int lastDigit = 0;
        int rev = 0;
        while(n > 0) {
            lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n /= 10;
        }
        System.out.println("Reverse is " + rev);
        sc.close();
    }    
}
