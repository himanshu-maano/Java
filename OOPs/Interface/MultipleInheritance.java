package Interface;

public class MultipleInheritance {
    public static void main(String[] agrs) {
        Bike1 hero = new Bike1();
        hero.speedLimit();
        hero.changeGear();
    }
}

interface Bike {
    void changeGear();

}

interface Honda extends Bike {
    void speedLimit();
}

class Bike1 implements Honda {
    public void changeGear(){
        System.out.println("changes gear...");
    }

    public void speedLimit(){
        System.out.println("limit is 180km/h...");
    }
}