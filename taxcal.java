import java.util.*;

public class taxcal {
    public static void main (String[] agrs) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax;
        if(income < 500000) {
            tax = 0;
        }
        else if (income >= 500000 && income < 1000000) {
            tax = (income * 0.2);
        }
        else {
            tax = income * 0.3;
        }
        System.out.println("Your tax is :" + tax);
        sc.close();
    }
}
