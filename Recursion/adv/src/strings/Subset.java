package src.strings;

import java.util.ArrayList;

// import java.util.*;

public class Subset {

    public static void main(String[] agrs) {
        subseq("", "abc");
        // System.out.println(subseqList("", "abc"));
        // System.out.println(subseqListascii("", "abc"));
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));

        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqList(p + ch, up.substring(1));

        ArrayList<String> right = subseqList(p, up.substring(1));

        left.addAll(right);

        return left;
    }

    static ArrayList<String> subseqListascii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subseqListascii(p + ch, up.substring(1));

        ArrayList<String> second = subseqListascii(p, up.substring(1));

        ArrayList<String> third = subseqListascii(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
