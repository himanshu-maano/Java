import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int n = sc.nextInt();
        int sum = 0;
        int lastDigit = 0;
        int m = n;
        while(n>0) {
            lastDigit = n%10;
            sum += (lastDigit*lastDigit*lastDigit);
            n/=10;
        }
        if(sum == m) {
            System.out.println(m + " " + "is armstrong num");
        }
        else {
            System.out.println("Not armstrong");
        }
        sc.close();
    }
}
