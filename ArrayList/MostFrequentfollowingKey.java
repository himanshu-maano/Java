import java.util.*;

public class MostFrequentfollowingKey {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        int key = 2;

        System.out.println(mostFrequent(list, key));
    }

    private static int mostFrequent(List<Integer> nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                map.put(nums.get(i + 1), map.getOrDefault(nums.get(i + 1), 0) + 1);
            }
        }

        int maxFreq = 0;
        int maxNum = 0;
        for (int x : map.keySet()) {
            if (map.get(x) > maxFreq) {
                maxFreq = map.get(x);
                maxNum = x;
            }
        }

        return maxNum;
    }
}
