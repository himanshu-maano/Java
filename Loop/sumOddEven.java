import java.util.*;

public class sumOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenNum = 0;
        int oddNum = 0;
        int choose;
        do {
            System.out.print("Enter num : ");
            int n = sc.nextInt();
            if(n % 2 == 0) {
                evenNum += n;
            }
            else {
                oddNum += n;
            }
            System.out.print("Choose '1' to continue or '0' to exit : ");
            choose = sc.nextInt();
        } while(choose == 1);
        System.out.println("Sum of odd num : " + oddNum);
        System.out.println("Sum of even num : " + evenNum);
        sc.close();
    }
}
