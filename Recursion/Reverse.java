public class Reverse {

    static int rev = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int lastDigit = n % 10;
        rev = (rev * 10) + lastDigit;
        reverse(n / 10);
    }

    public static void main(String[] args) {
        int n = 1432;
        // int sizeOfDigit = (int)Math.log10(n) + 1;
        // System.out.println(reverse2(n, sizeOfDigit));
        System.out.println(reverse3(n));
    }

    static int reverse2(int n, int power){
        if(n % 10 == n){
            return n;
        }
        int ld = n % 10;
        return ld * (int)Math.pow(10, power-1) + reverse2(n/10, power-1);
    }


    static int reverse3(int n){
        int sizeOfDigit = (int)Math.log10(n) + 1;
        return helper(n, sizeOfDigit);
    }

    static int helper(int n, int power){
        if(n % 10 == n){
            return n;
        }
        return ((n % 10) * (int)Math.pow(10, power-1)) + helper(n/10, --power);
    }
}
