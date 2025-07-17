package src.strings;

// Amazon Google  De Shaw  Uber ....

import java.util.*;

public class PhoneNum {
    public static void main(String[] args) {
        Solution obj1 = new Solution();
        System.out.println(obj1.letterCombinations("27"));
        ;
    }
}

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = combinations("", digits);

        return ans;
    }

    List<String> combinations(String p, String up) {
        if (up.isEmpty()) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        List<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        for (int i = ((digit - 1) * 3) - 3; i < ((digit * 3) - 3); i++) {
            char ch = (char) ('a' + i);
            ans.addAll(combinations(p + ch, up.substring(1)));
        }

        return ans;
    }
}
