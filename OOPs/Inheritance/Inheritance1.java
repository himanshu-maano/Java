package Inheritance;


public class Inheritance1 {
    public static void main(String[] agrs) {
        Dog kallu = new Dog("brown",4);
        // kallu.setColor("brown");
        kallu.getColor();
        System.out.println(kallu.legs);
        // kallu.eat();
        // kallu.bark();
        // Birds b1 = new Birds();
        // b1.breath();
        // b1.legs = 2;
        // System.out.println(b1.legs);

        // Mammal m1 = new Mammal();
        // m1.breath();
        // m1.color = "gray";
        // m1.getColor();
    }
}

// //  SuperClass/ Parent Class
// class Employee {
//     int salary = 100000;
// }
// // SubCLass / Child Class
// class Programmer extends Employee {
//     int bonus = 1000;
// }


// Base Class / Parent Class
class Animal {
    String color;

    Animal(String color){
        this.color = color;
    }

    void eat() {
        System.out.println("eating....");
    }

    void breath() {
        System.out.println("breathing....");
    }

    void setColor(String color){
        this.color = color;
    }

    void getColor(){
        System.out.println(this.color);
    }
}

// Derived Class / Child class
class Dog extends Animal {
    int legs;
    Dog(String colors, int legs){
        super(colors);
        this.legs  = legs;
    }

    
    void bark(){
        System.out.println("barking....");
    }
}

class Mammal extends Animal {
    int legs;

    Mammal(String color) {
        super(color);
    }
}

// class Birds extends Mammal {
//     void fly() {
//         System.out.println("flying...");
//     }
// }