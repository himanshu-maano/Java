import java.util.*;

public class is_Prime {
    public static boolean isPrime (int n) {
        // for 2
        if (n == 2 ) {
            return true;
        }
        // for n>2
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {//Num is not prime
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumInRange(int n) {
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println("1 is neither prime nor composite!");
        }
        printPrimeNumInRange(n);
        sc.close();
    }
}
