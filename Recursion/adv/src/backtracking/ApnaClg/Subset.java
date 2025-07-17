package src.backtracking.ApnaClg;

public class Subset {
    public static void main(String[] args) {
        subset("abc", new StringBuilder());
    }

    static void subset(String s, StringBuilder ans) {
        if(s.isEmpty()) {
            if(ans.isEmpty()){
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        char set = s.charAt(0);

        subset(s.substring(1), ans.append(set));

        ans.deleteCharAt(ans.length()-1);

        subset(s.substring(1), ans);
    }
}
