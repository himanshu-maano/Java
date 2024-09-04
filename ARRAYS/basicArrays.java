import java.util.*;

public class basicArrays {
    
    // passing array as argument in function
    public static void update (int mark[]) {
        for(int i=0; i<mark.length; i++) {
            mark[i] += 1;
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark[] = {96, 95, 98};
        update(mark);
        for(int i=0; i<mark.length; i++) {
            System.out.print(mark[i] + " ");
        }
        // // creating array
        // int marks[] = new int[50];

        // // length of Array
        // System.out.println("Length of array : " + marks.length);

        // // input taking
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // // output
        // System.out.println("phy : " + marks[0]);
        // System.out.println("Chem : " + marks[1]);
        // System.out.println("Math : " + marks[2]);

        // // update
        // marks[2] = marks[2] + 1;

        // System.out.println("Updated math marks : " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2])/3;
        // System.out.println("percentage : " + percentage + "%");

        sc.close();
    }
}