// import java.util.*;

public class RBS{
    public static void main(String[] args) {
        int[] a = {7,8,9,10,11,1,2,3,4,5,6};
        
        RotatedBinarySearch obj = new RotatedBinarySearch();
        // int idx = obj.search(a, 1, 0, a.length-1);

        // System.out.println(idx);

        System.out.println(obj.rotatedSearch(a, 1));
    }

    static int rotatedBS(int[] a, int target){
        int pivot = findPivot(a, 0, a.length-1);

        if(pivot == -1){
            return binarySearch(a, target, 0, a.length-1);
        }

        if(a[pivot] == target){
            return pivot;
        }

        if(target >= a[0] && target < a[pivot]){
            return binarySearch(a, target, 0, pivot-1);
        }

        return binarySearch(a, target, pivot + 1, a.length-1);
    }


    static int findPivot(int[] a, int start, int end){
        int mid = start + (end - start) / 2;
        
        if(start > end){
            return -1;
        }

        if(mid < end && a[mid] > a[mid + 1]){
            return mid;
        }

        if(mid > start && a[mid] < a[mid - 1]){
            return mid - 1;
        }

        if(a[mid] > a[start]){
            return findPivot(a, mid + 1, end);
        }
        else{
            return findPivot(a, start, mid - 1);
        }
    }



    static int binarySearch(int[] a, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int mid = s + (e - s) / 2;

        if(target == a[mid]){
            return mid;
        }

        if(target < a[mid]){
            return binarySearch(a, target, s, mid - 1);
        }
        return binarySearch(a, target, mid + 1, e);
    }
}