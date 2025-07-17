import java.util.Scanner;

public class SumofN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumofN(n));
        sc.close();
    }

    static int sumofN(int n){
        if(n == 1){
            return n;
        }
        int sum = n + sumofN(n-1);
        return sum;
    }
}
