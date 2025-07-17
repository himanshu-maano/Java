package Abstract;

public class TestAbstract {
    public static void main(String[] agrs){
        Bike b1 = new Hero();

        b1.brake();
        // b1.speed();
        
        Bike b2 = new Honda();

        b2.speed();
        // b2.brake();
    }
}
