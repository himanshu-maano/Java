package Inheritance;


public class Inheritance2 {
    public static void main(String[] args) {
            Eagel e1 = new Eagel();
            e1.breath();
            e1.setColor("brownish..");
            e1.getColor();

            // Human h1 = new Human();
            // h1.setLeg(2);
            // h1.setHand(2);
            // h1.getHand();
            // h1.getLeg();

            
    }

    public static void greet() {
        System.out.println("I am Himan...");
    }
}

class Animals {
    String color;
    
    void breath() {
        System.out.println("breathing...");
    }

    void setColor(String color) {
        this.color = color;
    }

    void getColor() {
        System.out.println(this.color);
    }

}

class Fish extends Animals {
    void swin() {
        System.out.println("swinging...");
    }

}

class Bird extends Animals {
    void fly() {
        System.out.println("flying...");
    }
}

class Mammal extends Animals {
    int leg;
    void setLeg(int leg){
        this.leg = leg;
    }

    void getLeg() {
        System.out.println(this.leg);
    }
}

class Eagel extends Bird {
    Eagel() {
        System.out.println("eagel fly high...");
    }
}

class Human extends Mammal {
    int hands;
    void setHand(int hand) {
        this.hands = hand;
    }

    void getHand() {
        System.out.println(this.hands);
    }
}