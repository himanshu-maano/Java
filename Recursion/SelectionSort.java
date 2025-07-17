class SelectionSort {

    void sort(int[] arr, int idx, int n, int maxIdx) {
        if(n == 0) {
            return;
        }

        if(idx < n) {
            if(arr[idx] > arr[maxIdx]) {
                maxIdx = idx;
            } 
            sort(arr, idx + 1, n, maxIdx);
        }
        else{
            swap(arr, maxIdx, n-1); //swaping with last element
            sort(arr, 0, n-1, 0);
        }
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    void sort(int[] arr) {
        int idx = 0;
        int n = arr.length;
        int maxIdx = 0;
        while(n > 0) {
            if(idx < n) {
                if(arr[idx] > arr[maxIdx]) {
                    maxIdx = idx;
                }
                idx++;
            }
            else{
                swap(arr, maxIdx, n-1);
                idx = 0;
                n = n-1;
                maxIdx = 0;
            }
        }
    }
}
