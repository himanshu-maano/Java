package src.backtracking.ApnaClg;

import java.util.*;

public class FindPermutation {
    public static void main(String[] args) {
        // permutation("abc", "");

        List<String> ans = permutationList("abc", new StringBuilder());

        System.out.println(ans);
    }

    static List<String> permutationList(String s, StringBuilder sb) {
        if (s.isEmpty()) {
            List<String> ans = new ArrayList<>();
            ans.add(sb.toString());

            return ans;
        }

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            ans.addAll(permutationList(s.substring(0, i) + s.substring(i + 1), sb.append(s.charAt(i))));
            sb.deleteCharAt(sb.length()-1);
        }

        return ans;
    }

    

    static void permutation(String s, String ans) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            permutation(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
        }
    }
}
