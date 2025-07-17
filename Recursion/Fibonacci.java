import java.util.HashMap;

public class Fibonacci {
    static HashMap<Integer, Integer> hm = new HashMap<>();
    public static void main(String[] args){
        int n = 4;
        System.out.println(nth_fibbo(n));
    }

    public static int nth_fibbo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        
        int fibbonacci = nth_fibbo(n-1) + nth_fibbo(n-2);

        hm.put(n, fibbonacci);
        return fibbonacci;
    }
}
