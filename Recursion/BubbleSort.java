class BubbleSort {
    void sort(int[] arr, int idx, int n) {
        if (n == 0) {
            return;
        }

        if (idx < n) {

            if (arr[idx] > arr[idx + 1]) {
                swap(arr, idx, idx + 1);
            }

            sort(arr, idx + 1, n);
        } else {
            sort(arr, 0, n - 1);
        }
    }

    void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }

    void sort(int[] arr) {
        int idx = 0;
        int n = arr.length - 1;
        while(n > 0) {
            if(idx < n) {
                if(arr[idx] > arr[idx+1]) {
                    swap(arr, idx, idx+1);
                }
                idx++;
            }
            else{
                idx = 0;
                n = n-1;
            }
        }
    }
}
