// import java.util.*;

public class Decreasing {
    public static void main(String[] agrs){
        N_2(10);
    }

    static void N_2(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        N_2(n-1);
    }
    // sc.close();
}