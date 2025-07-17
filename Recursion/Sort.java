import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        int[] arr = {4, 1, 3, 5, 2};
        
        
        BubbleSort obj =  new BubbleSort();

        obj.sort(arr, 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));

        // SelectionSort obj2 = new SelectionSort();
        // obj2.sort(arr);

        // System.out.println(Arrays.toString(arr));

        // MergeSort obj3 = new MergeSort();
        // arr = obj3.mergeSort(arr);
        // MergeSort.mergeSort2(arr, 0, arr.length-1);

        // System.out.println(Arrays.toString(arr));

        // QuickSort obj4 = new QuickSort();
        // obj4.quickSort(arr, 0, arr.length - 1);

        // System.out.println(Arrays.toString(arr));
    }
    
    // private static boolean checkSort(int[] a, int s){
    //     if(s == a.length-1){
    //         return true;
    //     }
    //     return (a[s] < a[s+1]) & (checkSort(a, s+1));
    // } 
}
