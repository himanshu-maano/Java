public class reverseArray {

    // time complexity -> O(n)
    // space complexity -> O(1)
    public static void reverse_Array(int arr[]) {
        int i = 0, j = arr.length-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main (String[] agrs) {
        int arr[] = {1, 5, 6, 9, 8, 7};
        reverse_Array(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
