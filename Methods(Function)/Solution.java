import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter 1st num : ");
        // double x = sc.nextDouble();
        // System.out.print("Enter 2nd num : ");
        // double y = sc.nextDouble();
        // System.out.print("Enter 3rd num : ");
        // double z = sc.nextDouble();
        // System.out.println("Average of 3 num : " + avg_3Num(x, y, z));

        // System.out.print("Input integers : ");
        // int n = sc.nextInt();
        // if(isEven(n)){
        //     System.out.println(n + " is even.");
        // }
        // else {
        //     System.out.println(n + " is odd.");
        // }
        
        // System.out.print("Input integer : ");
        // int num = sc.nextInt();
        // if(isPalindrome(num)) {
        //     System.out.print("Number is palindrome.");
        // }
        // else {
        //     System.out.print("Number is not palindrome");
        // }

        int  a = sc.nextInt();
        System.out.println(sumDigits(a));
        sc.close();
    }    

    // average of 3 given num
    public static double avg_3Num (double x, double y, double z) {
        return (x+y+z)/3;
    }
    // even or odd
    public static boolean isEven (int n) {
        if(n%2==0){
            return true;
        }
        return false;
    }

    // palindrome number
    public static boolean isPalindrome (int num) {
        int myNum = num;
        int reverse = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            reverse = reverse*10 + lastDigit;
            num /= 10;
        }
        
        // if palNum and reverse are equal then given num is palindrome

        if(reverse == myNum) {
            return true;
        }
        return false;
    }

    // sum of digit 
    public static int sumDigits(int num) {
        int sumOfDigit = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            sumOfDigit += lastDigit;
            num /= 10;
        }
        return sumOfDigit;
    }
}
