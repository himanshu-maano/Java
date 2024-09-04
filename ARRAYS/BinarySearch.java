public class BinarySearch {
    public static int binarySearch (int numbers[], int key) {
        int start = 0;
        int end = numbers.length-1;
        int mid = 1;
        while(start <= end) {
            mid = (start + end) / 2;
            if(numbers[mid] == key) {
                return mid;
            }
            else if (numbers[mid] < key) {
                start = mid + 1;
            } 
            else if (numbers[mid] > key){
                end = mid - 1;
            }
            else {
                System.out.println("Key not found");
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        int numbers[] = {4, 85, 9, 6, 10, 11, 61, 9};
        int key = 11;
        int index = binarySearch(numbers, key);
        System.out.println("Key is at index : " + index);
    }
    
}
