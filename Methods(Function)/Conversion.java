import java.util.*;

public class Conversion {

    public static void binToDec (int binNum) {
        int myNum = binNum;
        int power = 0;
        int decimal = 0;
        while(binNum > 0) {
            int lastDigit = binNum % 10;  //lastdigit of given num
            decimal += (lastDigit * ((int)Math.pow(2, power)));   //sum of converted decimal num
            power++;
            binNum /= 10;  //to remove lastdigit
        }
        System.out.print("decNum of " + myNum + " : " + decimal);
    }

    public static void decToBin (int decNum) {
        int myNum = decNum;
        int power = 0;
        int binary = 0;
        while(decNum > 0) {
            int rem = decNum % 2; //rem when divide by 2
            binary += (rem * (int)Math.pow(10,power));
            power++;
            decNum /= 2;  //given num divide by 2
        }
        System.out.print("binNum of " + myNum + " : " + binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary : ");
        int n = sc.nextInt();
        // binToDec(n);
        decToBin(n);
        sc.close();
    }
}
 