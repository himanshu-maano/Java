package Assigment;

public class sortingQ {

    public static void reversebubbleSort (int arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            for(int j=1; j<n-i; j++) {
                if(arr[j-1] < arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void reverseselectionSort (int arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            // int max = Integer.MIN_VALUE;
            int maxIdx = i;
            
           for(int j=i+1; j<n; j++) {
            if(arr[maxIdx] < arr[j]) {
                // max = arr[j];
                maxIdx = j;
            }
           }
           int temp = arr[i];
           arr[i] = arr[maxIdx];
           arr[maxIdx] = temp;
        }
    }


    
    public static void reverseinsertionSort (int arr[]) {
        int n = arr.length;
        for(int i=1; i<n; i++) {
            int curr = arr[i];
            int j = i-1;
            while((j > -1) && arr[j] < curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }



    public static void countSort (int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        int n = count.length;
        for(int i=n-1; i>=0; i--) {
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }


    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] agrs) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        reverseselectionSort(arr);
        printArray(arr);
    }
}
