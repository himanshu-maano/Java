package Interface;

public class MultiInheritance {
    public static void main(String[] agrs) {
        Bear bear = new Bear();
        bear.eat();
    }
}

interface Herbivore {
    void eat();
}

interface Carnivore {
    void eat();
}


class Bear implements Herbivore, Carnivore
{
    public void eat(){
        System.out.println("eats both grass & meat...");
    }

}

/*As we can see in the above, Herbivore and Carnivore interface
 have same methods but its implementation is provided by class Bear,
 so there is no ambiguity in the program, which leads to multiple inheritance.*/