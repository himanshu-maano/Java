package Abstract;

public abstract class Bike {
    public Bike(){
        System.out.println("Bike is created...");
    }

    public void brake(){
        System.out.println("bike stops...");
    }

    public abstract void speed();
}

