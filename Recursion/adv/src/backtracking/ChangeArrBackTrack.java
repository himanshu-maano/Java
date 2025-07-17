package src.backtracking;

import java.util.Arrays;

public class ChangeArrBackTrack {
    static void changeArr(int[] arr, int i, int val) {
        if(i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = val - 2;
    }

    public static void main(String[] args) {
        int[] nums = new int[5];
        changeArr(nums, 0, 1);
        System.out.println(Arrays.toString(nums));
    }
}
