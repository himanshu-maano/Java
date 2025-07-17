import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        for(int i=1; i<=5 ; i++) {
            list.add(i * 2);
            list2.add(i * 3);
            list3.add(i * 5);
        }

        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);
    }
}