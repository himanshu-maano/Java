import java.util.*;

public class ContainerwithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(mostWater(list));
    }

    static int mostWater(List<Integer> heigth) {
        int maxWater = 0;

        int i = 0, j = heigth.size() - 1;
        while (i < j) {
            int currWater = Math.min(heigth.get(i), heigth.get(j)) * (j - i);

            maxWater = Math.max(maxWater, currWater);

            if (heigth.get(i) < heigth.get(j)) {
                i++;
            } else {
                j--;
            }
        }
        return maxWater;
    }
}
