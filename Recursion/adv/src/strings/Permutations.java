package src.strings;

import java.util.ArrayList;

public class Permutations {
    static void permutations(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        for(int i=0; i<=p.length(); i++) {
            String f = p.substring(0, i);
            String l = p.substring(i);
            permutations(f + ch + l, up.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;

        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);

        for(int i=0; i<=p.length(); i++) {
            String f = p.substring(0, i);
            String l = p.substring(i);
            ans.addAll(permutationsList(f + ch + l, up.substring(1)));
        }

        return ans;
    }

    public static void main(String[] args) {
        // permutations("", "abc");
        ArrayList<String> ans = permutationsList("", "abc");
        System.out.println(ans);

    }
}
