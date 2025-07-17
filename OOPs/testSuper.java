public class testSuper {
    public static void main(String[] agrs){
        Emp p1 = new Emp("Sita", 7, 75000);
        p1.show();
    }
}

class Person {
    String name;
    int id;
    Person(String s, int id){
        this.name = s;
        this.id = id;
    }
}

class Emp extends Person {
    double salary;
    // int id = 89;
    Emp(String s1, int id, double salary){
        super(s1, id);
        this.salary = salary;
    }

    void show(){
        System.out.println(super.name + " " + super.id + " " + this.salary);
    }
}