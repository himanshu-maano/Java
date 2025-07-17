public class TilingProblem {
    public static void main(String[] args){
        int n = 4;
        System.out.println(tilingWays(n));
    }

    public static int tilingWays(int n){
        if(n == 1 || n == 2){
            return n;
        }

        int fnm1 = tilingWays(n - 1); //f(n-1) when tile is vertical 

        int fnm2 = tilingWays(n - 2); //f(n-2) when tile is horizontal

        return (fnm1 + fnm2);
    }
}
