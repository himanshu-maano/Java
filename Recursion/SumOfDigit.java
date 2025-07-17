public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(digitProd(1342));
    }

    static int digitSum(int n){
        if(n == 0){
            return 0;
        }
        int lastDigit = n % 10;
        return lastDigit + digitSum(n / 10);
    }

    static int digitProd(int n){
        if(n % 10 == n){
            return n;
        }
        return (n % 10) * digitProd(n / 10);
    }
}
