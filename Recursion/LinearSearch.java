import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {1,7,6,8,5,8,36,74};
        int key = 8;
        System.out.println(search(a, key, 0));
        // findAllIndex(a, key, 0);
        // System.out.println(findAllIdx(a, key, 0));
    }

    static int search(int[] a, int key, int idx){
        if(idx == a.length){
            return -1;
        }
        if(a[idx] == key){
            return idx;
        }
        return search(a, key, idx+1);
    }

    // static ArrayList<Integer> list = new ArrayList<>();

    // static void findAllIndex(int[] a, int key, int idx){
    //     if(idx == a.length){
    //         return;
    //     }
    //     if(a[idx] == key){
    //         list.add(idx);
    //     }
    //     findAllIndex(a, key, idx+1);
    // }

    static ArrayList<Integer> findAllIndex2(int[] a, int key, int idx, ArrayList<Integer> list){
        if(idx == a.length){
            return list;
        }
        if(a[idx] == key){
            list.add(idx);
        }
        return findAllIndex2(a, key, idx+1, list);
    }


    /*
        In this we are creating new ArrayList Object evevrytime fun is called so for larger array it will fails due to stack OverFlow.

    static ArrayList<Integer> findAllIdx(int[] a, int key, int idx){
        ArrayList<Integer> list = new ArrayList<>();

        if(idx == a.length){
            return list;
        }

        if(a[idx] == key){
            list.add(idx);
        }

        ArrayList<Integer> ans = findAllIdx(a, key, idx + 1);

        list.addAll(ans);

        return list;
    }

     */
}
