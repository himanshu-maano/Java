// import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {0,2,4,5,9,11,77,88};
        System.out.println(search(a, 4, 0, a.length-1));
    }

    static int search(int[] a, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e - s) / 2;
        if(target == a[mid]){
            return mid;
        }
        if(target < a[mid]){
            return search(a, target, s, mid - 1);
        }
        else{
            return search(a, target, mid + 1, e);
        }
    }
}
