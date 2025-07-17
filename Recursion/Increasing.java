public class Increasing {
    public static void main(String[] args){
        increas1_N(10);
    }

    static void increas1_N(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        increas1_N(n-1);
        System.out.print(n + " ");
        // return;
    }
}
