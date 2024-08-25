import java.util.*;

public class operator {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        float pencil = s.nextFloat();
        float pen = s.nextFloat();
        float eraser = s.nextFloat();
        System.out.println("total bill = " + (pencil + pen + eraser));
        int a = 8;
        int b = 8;
        System.out.println("Sum = " + (a+b));
        System.out.println("Substract = " + (a-b));
        System.out.println("Multiply = " + (a*b));
        System.out.println("Divide = " + (a/b));
        System.out.println("Modulo(remainder) = " + (a%b));

        // Relational operator
          

        // int A = 9;
        // int B = 9;
        // System.out.println((A == B));
        // System.out.println((A != B));
        // System.out.println((A < B));
        // System.out.println((A > B)); 
        // System.out.println((A <= B));
        // System.out.println((A >= B));
         s.close();
    } 
}
