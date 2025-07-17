
import Polymorphism.Dynamic.*;

public class Main2 {
    public static void main(String[] agrs) {
        Bank b1 = new Uco(); //Upcasting

        b1.interest();

        Animal a1 = new Human();
        a1.eat();

        
    }
    
}

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Mammals extends Animal {
    void eat() {
        System.out.println("eats variety of foods...");
    }
}

class Human extends Mammals {
    void eat() {
        System.out.println("omnivores....");
    }
}

