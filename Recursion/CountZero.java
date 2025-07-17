public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZeros(10401));
    }

    static int countZeros(int n){
        return helper(n, 0);
    }

    static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        int ld = n % 10;
        if(ld == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}
