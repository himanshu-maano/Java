package Polymorphism.Static;

public class Square {
    public double area (double a){
        return Math.pow(a, 2);
    }

    public int area (int a) {
        return (int)Math.pow(a, 2);
    }
}
