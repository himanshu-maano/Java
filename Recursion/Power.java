public class Power {
    public static void main(String[] args){
        // double x = 2;
        // double n = 3;
        // if(n < 0){
        //     System.out.println(1 / powerN(x, n));
        // }
        // else{
        //     System.out.println(powerN(x, n));
        // }
        System.out.println(optimizedPowerN(2, 10));
        
    }

    static double powerN(double x, double n) {
        if(n == 0){
            return 1;
        }
        double expo = Math.abs(n);
        return x * powerN(x, expo-1);
    }


    static int optimizedPowerN(int x, int n) {
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPowerN(x, n/2);
        int halfPower_Sq = halfPower * halfPower;
        
        if(n % 2 == 1){
            halfPower_Sq = x * halfPower_Sq;
        }
        return halfPower_Sq;
    }
}
