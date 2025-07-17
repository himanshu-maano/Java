public class Staircase_Search {
    public static boolean staircase_Search (int arr[][], int key){
        int row = arr.length-1;
        int col = 0;
        while (row >= 0 && col<arr[0].length) {
            if(arr[row][col] == key) {
                System.out.print("Key is at (" + row + "," + col + ")");
                return true;
            }
            else if (key < arr[row][col]) {
                row--;
            }
            else {
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }


    public static void main (String[] agrs) {
        int arr[][] = {{10,20,30,40},
                       {15,26,37,48},
                       {25,32,41,50},
                       {27,33,49,76}};
        int key = 33;
        staircase_Search(arr, key);
    }
}
