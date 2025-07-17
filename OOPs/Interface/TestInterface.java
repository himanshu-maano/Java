package Interface;

public class TestInterface {
    public static void main(String[] agrs) {
        Rectangle s1 = new Rectangle();
        System.out.println(s1.area(5, 7));

        s1.getArea();
    }

}


interface Shape {
    void draw();
    
}

class Rectangle implements Shape {
    private int l,b;
    public void draw(){
        System.out.println("rectangle drawing...");
    }

    public int area(int l, int b){
        this.l = l;
        this.b = b;
        return l*b;
    }

    void getArea() {
        System.out.println(area(this.l, this.b));
    }
}