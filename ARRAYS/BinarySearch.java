public class BinarySearch {  

    // array will always be in sorted form
    // Time complexityb -> O(log n) 
    public static int binarySearch (int numbers[], int key) {
        int start = 0;
        int end = numbers.length-1;
        while(start <= end) {
            int mid = (start + end) / 2;
            // comparision
            if(numbers[mid] == key) { //found
                return mid;
            }
            if (numbers[mid] < key) { //Right side -> start will update
                start = mid + 1;
            } 
            else {           // Left side -> end will update
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {4, 85, 9, 6, 10, 11, 61, 9};
        int key = 4;
        int index = binarySearch(numbers, key);
        if(index == -1) {
            System.out.println("Key not found!");
        } else {
            System.out.println("Key is at index : " + index);
        }
    }
    
}
