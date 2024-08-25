import java.util.*;
public class prac {
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
            System.out.println("Armstrong num");
        }
        else {
            System.out.println("not");
        }
        sc.close();
    }
}
