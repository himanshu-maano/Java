import java.util.ArrayList;

public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);

        System.out.println(isPairSumRotated(list, 6));
    }

    private static boolean isPair(ArrayList<Integer> list, int target) {
        int l = 0, r = list.size() - 1;
        while (l < r) {
            int sum = list.get(l) + list.get(r);

            if (sum == target) {
                return true;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        return false;
    }

    private static ArrayList<Integer> isPairSum(ArrayList<Integer> list, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int l = 0, r = list.size() - 1;
        while (l < r) {
            int sum = list.get(l) + list.get(r);

            if (sum == target) {
                result.add(list.get(l));
                result.add(list.get(r));

                return result;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        return result;
    }

    private static ArrayList<Integer> isPairSumRotated(ArrayList<Integer> list, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        int l = 0, r = list.size() - 1;
        int n = list.size();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                l = i + 1;
                r = i;
                break;
            }
        }

        while (l != r) {
            int sum = list.get(l) + list.get(r);

            if (sum == target) {
                result.add(list.get(l));
                result.add(list.get(r));

                return result;
            } else if (sum < target) {
                l = (l + 1) % n;   // it work when we need left index in sorted rotated array
            } else {
                r = (n + r - 1) % n;  //it work when we need rigth index in sorted rotated array
            }
        }

        return result;
    }
}


// if there is rotated array situation type question can use ->  (i + j) % n
