import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3,4,2,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int corrIdx = nums[i] - 1;  //correct Idx of value at i idx
            if(nums[i] != nums[corrIdx]){ // checking if element at idx i also in its right position index
                swap(nums, i, corrIdx);
            }
            else{
                i++;          //only updating when element at idx i is also at its correct Index
            }
        }
    }


    static void swap(int[] nums, int a, int b){//swap
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }



    // static String toString(int[] a) {
    //     if (a == null)
    //         return "null";
    //     int iMax = a.length - 1;
    //     if (iMax == -1)
    //         return "[]";

    //     StringBuilder b = new StringBuilder();
    //     b.append('[');
    //     for (int i = 0; ; i++) {
    //         b.append(a[i]);
    //         if (i == iMax)
    //             return b.append(']').toString();
    //         b.append(", ");
    //     }
    // }

}
