import java.util.Scanner;

public class Matrix {

    public static boolean search (int matrix[][] , int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at (" + i + ","+ j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }


    public static void largest_smallest (int matrix[][]) {
        int largest = matrix[0][0], smallest = matrix[0][0];
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                largest = Math.max(matrix[i][j], largest);
                smallest = Math.min(matrix[i][j], smallest);
            }
        }
        System.out.println("Largest no. in matrix is " + largest);
        System.out.println("Smallest no. in matrix is " + smallest);
    }


    public static void main(String[] agrs) {
        int matrix[][] = new int[3][2];
        int n = matrix.length, m = matrix[1].length;
        
        // taking input
        Scanner sc = new Scanner (System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // print matrix
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // int key = 5;
        // search(matrix, key);

        largest_smallest(matrix);
        sc.close();
    }
}