
public class fun_Overloading {
    
    // fun to cal Sum of 2 int num
    public static int Sum(int a, int b) {
        return a + b;
    }

    // Sum of 3 num
    public static float Sum(int a, int b, int c) {
        return a + b + c;
    }

    // fun to cal float sum
    public static float Sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(Sum(5, 6));
        System.out.println(Sum(8.5f, 6.1f));
        System.out.println(Sum(5,6,7));
    }
}