import java.util.Scanner;

class Bitoperators {
    public static void checkOddEven(int n){
        int bitMask = 1;
        if((n & bitMask) != 0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        return n & ~(1 << i);
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }


    public static int clearIBit(int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }


    public static int clearBitsinRange(int n, int i, int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }


    public static boolean isPowerofTwo (int n){
        return (n & (n-1)) == 0;
    }


    public static int setBitCount(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    }


    public static int fastExpo(int n, int b){
        int ans = 1;
        while(b > 0){
            if((b & 1) == 1){
                ans *= n;
            }
            n = n*n;
            b = b >> 1;
        }
        return ans;
    }



    public static void main(String[] agrs){
    // System.out.println(5 & 6);
    // System.out.println(5 | 6);
    // System.out.println(3 ^ 4);
    // System.out.println(~-4);
    // System.out.println(6 << 3);


    Scanner sc = new Scanner (System.in);
    // int n;
    // n = sc.nextInt();
    // int b = sc.nextInt();
    // int j = sc.nextInt();
    // checkOddEven(n);
    // int newBit = sc.nextInt();
    System.out.println(fastExpo(-2, 4));

    sc.close();
    }
}