import java.util.*;

public class sumN {
    public static void main (String agrs[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        System.out.println("Enter num : ");
        int n = sc.nextInt();
        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
