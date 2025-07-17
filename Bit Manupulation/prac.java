import java.util.*;
public class prac {
    public static String compress(String s)
    {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            int count = 1;
            while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1))
            {
                count++;
                i++;
            }
            if(count > 1){
                sb.append(s.charAt(i));
                sb.append(count);
            }
            else{
                sb.append(s.charAt(i));
            }
            
        }
        return sb.toString();
    }

    // public static String uniqueElement(String s){
    //     StringBuilder sb = new StringBuilder(" ");
        
        
    // }


    public static int power(int x, int y){
        int ans = 1;
        while(y > 0){
            if((y & 1 )!= 0){
                ans *= x;
            }
            x *= x;
            y = y >> 1;
        }
        return ans;
    }

    public static int add_1(int x){
        return -~x;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // String s = "acccaabb";
        System.out.println(add_1(9));
        // uniqueElement(s);
        sc.close();
    }
}
