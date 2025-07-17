public class FirstOccurance {
    public static void main(String[] args){
        int[] a = {4, 5, 7, 9, 1, 5, 3, 2, 1};
        int key = 2;
        System.out.println(lastOccurance(a, key, a.length-1));
    }

    static int firstOccurance(int[] a ,int key, int i){
        if(a[i] == key){
            return i;
        }
        if(i == a.length-1){
            return -1;
        }
        return firstOccurance(a, key, i+1);
    }

    static int lastOccurance(int[] a ,int key, int i){
        if(a[i] == key){
            return i;
        }
        if(i == 0){
            return -1;
        }
        return lastOccurance(a, key, i-1);
    }
}
