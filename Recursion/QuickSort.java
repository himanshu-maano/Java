// import java.util.Arrays;

class QuickSort {
    /*  quick sort worse time complexity -> O(n^2) if pivot is smallest
        or largest element of array and array is already sorted.
    */
    void quickSort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int pivot = arr[(start + end)/2];
        
        while(start <= end) {
            while(arr[start] < pivot){
                start++;
            }

            while(arr[end] > pivot){
                end--;
            }

            if(start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        // sorting left part to pivot
        quickSort(arr, low, end);
        // sorting right part to pivot
        quickSort(arr, start, high);
    }

    private void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
