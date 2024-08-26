import java.util.Scanner;

public class characterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lines : ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i=1; i<=n; i++) { //no. of lines
            for(int j=1; j<=i; j++) { //no. of character
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
