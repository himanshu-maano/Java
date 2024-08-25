import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter operator : ");
        char operator = sc.next().charAt(0);
        switch(operator) {
        case '+' : System.out.println("sum is " + (a+b));
                    break;
        case '-' : System.out.println("sub is " + (a-b));
                    break;
        case '*' : System.out.println("Product is " + (a*b));
                    break;
        case '/' : System.out.println("Divide is " + (a/b));
                    break;
        case '%' : System.out.println("Modulo(remainder) is " + (a%b));
                    break;
        default : System.out.println("not valid operator");
        sc.close();
        }
    }
}
