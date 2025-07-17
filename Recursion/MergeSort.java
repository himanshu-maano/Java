import java.util.Arrays;

class MergeSort {
    int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    int[] merge(int[] first, int[] second) {
        int n = first.length;
        int m = second.length;
        int[] mix = new int[n + m];

        int l = 0;
        int r = 0;
        int k = 0;

        while (l < n && r < m) {
            if (first[l] <= second[r]) {
                mix[k++] = first[l++];
            } else {
                mix[k++] = second[r++];
            }
        }

        while (l < n) {
            mix[k++] = first[l++];
        }

        while (r < m) {
            mix[k++] = second[r++];
        }

        return mix;
    }

    static void mergeSort2(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort2(arr, si, mid);

        mergeSort2(arr, mid + 1, ei);

        merge2(arr, si, mid, ei);
    }

    private static void merge2(int[] arr, int si, int mid, int ei) {
        int[] merge = new int[ei - si + 1];

        int l = si, r = mid + 1, k = 0;

        while(l <= mid && r <= ei) {
            if(arr[l] <= arr[r]) {
                merge[k++] = arr[l++];
            } else {
                merge[k++] = arr[r++];
            }
        }

        while(l <= mid) {
            merge[k++] = arr[l++];
        }

        while(r <= ei) {
            merge[k++] = arr[r++];
        }

        for (int i = si, j = 0; j < merge.length; i++, j++) {
            arr[i] = merge[j];
        }
    }
}
