// import java.util.*;

public class Largest_smallest {

    public static void getLarge_Small(int numbers[]) {
        int largest = Integer.MIN_VALUE; // smallest possible num
        int smallest = Integer.MAX_VALUE; // largest possible num
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("largest num is " + largest);
        System.out.println("Smallest num is " + smallest);
    }
    public static void main(String[] args) {
        int numbers[] = {4, 5, 8, 9, 72, 55};
        getLarge_Small(numbers);
    }
}
