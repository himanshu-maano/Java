import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2) {
            System.out.println("2 is prime num");
        }
        else{
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) { //it shows n is multiple of i(where i not equal to 1 or n)
                    isPrime = false;
                }
            }
            if(isPrime == true) {
                System.out.println(n + " " + "is prime num.");
            } 
            else {
                System.out.println(n + " " + "is not prime");
            }
            sc.close();
        }
    }
}
