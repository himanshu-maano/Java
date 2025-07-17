interface I1 {
    void m1();

    default void m2() {
        System.out.println("Default method...");
        this.m3();
    }

    private void m3() {
        System.out.println("this is private method called...");
    }

    static void m4() {
        System.out.println("static method is invokedd..");
    }
}

class Concrete implements I1 {
    public void m1() {
        System.out.println("abstract method is called...");
    }

    public void m2() {
        I1.super.m2();
        System.out.println("this is concrete default method..");
    }
}

class Car {
    String model;
    int year;

    Car setModel(String model) {
        this.model = model;
        return this;
    }

    Car setYear(int year) {
        this.year = year;
        return this;
    }

    void display() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

public class RoughPractice {
    public static void main(String[] args) {
        // Concrete obj = new Concrete();
        // obj.m1();
        // obj.m2();
        // I1.m4();

        Car myCar = new Car()
                .setModel("Toyota")
                .setYear(2022);
        myCar.display();
    }
}
