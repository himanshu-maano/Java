package src.strings;

// Practice purpose how to convert recursive to iterative

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SubSetIterative {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3 };
        List<List<Integer>> subsets = subsetPreventDuplicate(arr);

        for (List<Integer> list : subsets) {
            System.out.print(list + " ");
        }
    }

    static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    // Time Complixity - O(N * 2^N)
    // Space Complixity - O(2^N * N)

    static List<List<Integer>> subsetPreventDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }

            end = outer.size() - 1;
            int size = outer.size();

            for (int j = start; j < size; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
