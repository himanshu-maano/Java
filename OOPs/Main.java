import Polymorphism.Static.*;

public class Main {
    public static void main(String[] agrs) {
        Calculate calc = new Calculate();

        
        System.out.println(calc.sum(5, 4));
        System.out.println(calc.sum(4, 7, 9));
        System.out.println(calc.sum(2.4, 8.6));
        

        Square s1 = new Square();

        System.out.println(s1.area(7.5));
    }
}
