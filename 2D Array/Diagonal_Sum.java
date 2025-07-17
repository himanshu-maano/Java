import java.util.*;

public class Diagonal_Sum {
    public static int diagonalSum (int arr[][]) {
        int sum = 0;
        int n = arr.length;
        // for(int i=0; i<arr.length; i++) { 
        //     for(int j=0; j<arr[0].length; j++) {
        //         if(i == j || i + j == arr.length-1) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }
        
        // time complexity -> O(n)
        // space complexity -> O(1)
        for(int i=0; i<n; i++) {
            sum += arr[i][i];
            if(i != n-1-i) {            // i + j = n-1
                sum += arr[i][n-1-i];   // j = n-1-i
            }
        }
        return sum;
    }


 public static void main (String[] agrs) {
    Scanner sc = new Scanner (System.in);
    int arr[][] = new int[3][3];
    for(int i=0; i<arr.length; i++) {
        for(int j=0; j<arr[0].length; j++) {
            arr[i][j] = sc.nextInt();
        }
    }

    System.out.println("Sum of diagonals of Matrix : " + diagonalSum(arr));
    sc.close();
 }   
}
