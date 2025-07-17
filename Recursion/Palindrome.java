public class Palindrome {
    public static void main(String[] args) {
        // int n = 123321;
        int[] a = {1,2,3,2,1};
        System.out.println(palin(a));
    }

    //palindrome by recursion for array
    static boolean palin(int[] n){
        int s = 0;
        int e = n.length-1;
        int mid = s + (e - s) /2;
        return helper(n, s, e, mid);
    }

    static boolean helper(int[] a, int s, int e,int mid){
        if(s == mid && a[s] == a[e]){
            return true;
        }
        if(a[s] != a[e]){
            return false;
        }
        return helper(a, s+1, e-1, mid);
    }


    // palindrome by recursion for num...
    static boolean palindrome(int n){
        return (n == reverse(n));
    }

    static int reverse(int n){
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
