import java.util.*;

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);
        // float fl = sc.nextFloat();
        // System.out.println(fl);
        // boolean t = sc.nextBoolean();
        // System.out.println(t);
        // long price = sc.nextLong();
        // System.out.println(price);


        // TYpe conversion

        long n = sc.nextInt(); //int->long
        System.out.println(n);
        double num = sc.nextLong(); //long->double
        System.out.println(num);
        char ch = 'A';
        float ch1 = (float) ch;
        System.out.println(ch1);


        // Type Casting

        double marks1 = 6546.54;
        long marks2 = (long) marks1;
        System.out.println(marks2);



        // Type Promotion

        byte a = 12;
        short b = 21;
        char c = 'A';
        double d = a + b + c;
        System.out.println(d);

        char a1 = 'd';
        char a2 = 'c';
        System.out.println((int)(a2));
        System.out.println(a2 - a1);
                
    sc.close();
    }
}
 