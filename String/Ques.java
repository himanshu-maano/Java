public class Ques {

    public static boolean isPalindrome (String str) {
        
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }


    // time complexity -> O(n)

    public static double shortestPath (String path) {
        int x = 0, y = 0;
        for(int i = 0; i<path.length(); i++) {
            char dir = path.charAt(i);
            if(dir == 'W') {
                x--;
            }
            else if(dir == 'E') {
                x++;
            }
            else if(dir == 'N') {
                y++;
            }
            else {
                y--;
            }
        }
        double X2 = x*x;
        double Y2 = y*y;
        return Math.sqrt(X2 + Y2);
    }


    public static void main(String[] agrs) {
        // String str = "racecar";
        // System.out.println(isPalindrome(str));

        String path = "WNEENESENNNE";
        System.out.println(shortestPath(path));
    }
}
