package src.strings;

// Amazon

import java.util.ArrayList;
import java.util.List;

public class DiceRoll {
    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static List<String> diceList(String p, int target) {
        if (target == 0) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceList(p + i, target - i));
        }

        return ans;
    }

    public static void main(String[] args) {
        // dice("", 4);
        System.out.println(diceList("", 4));
    }
}
