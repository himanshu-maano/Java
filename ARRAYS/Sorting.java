import java.util.*;

public class Sorting {

    // // Bubble Sort
    // public static void bubble_Sort(int nums[]) { //time complexity -> O(n^2)
    //     boolean swap;
    //     for(int i=0; i<nums.length-1; i++) {
    //         swap = false;
    //         for(int j=0; j<nums.length-i-1; j++) {
    //             if(nums[j] > nums[j+1]) {
    //                 int temp = nums[j];
    //                 nums[j] = nums[j+1];
    //                 nums[j+1] = temp;
    //                 swap = true;
    //             }
    //         }
    //         if(swap == false) {
    //             break;
    //         }
    //     }
    // }


    // // Selection Sort
    // public static void selection_Sort (int nums[]) {
    //     for(int i=0; i<nums.length-1; i++) {//
    //         int minPos = i;
    //         for(int j=i+1; j<nums.length; j++) {
    //             if(nums[minPos] > nums[j]) { // 
    //                 minPos = j;
    //             }
    //         }
    //         // swap
    //         int temp = nums[i];
    //         nums[i] = nums[minPos];
    //         nums[minPos] = temp;
    //     }
    // }



    // Insertion Sort
    public static void Insertion_Sort (int nums[]) {
        for(int i=1; i<nums.length; i++) {
            int curr = nums[i];
            int j = i-1;

            while((j > -1) && (nums[j] > curr)) {
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] = curr;
        }
    }


    // Count Sort
    public static void countSort (int nums[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest +1];
        for(int i=0; i<nums.length; i++) {
            count[nums[i]]++;
        }

        // sorting
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }


    public static void printArray(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    // public static void printArray(Integer nums[]) {
    //     for(int i=0; i<nums.length; i++) {
    //         System.out.print(nums[i] + " ");
    //     }
    // }



     public static void main (String[] agrs) {
        int nums[] = {5, 4, 3, 7, 6, 11, 12};

        // Arrays.sort(nums);  // Inbuilt sort -> time complexity : O(log n)
        // printArray(nums);
        // System.out.println();

        // Arrays.sort(nums, Collections.reverseOrder()); // inbuilt sort in descending order

        countSort(nums);
        printArray(nums);
    }
}
