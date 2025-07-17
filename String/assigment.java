import java.util.*;

public class assigment {
    public static String lowerCase_vowel (String str ){
        // StringBuilder sb = new StringBuilder();
        Integer count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                count++;
            }
        }
        return count.toString();
    }



    //Checks Anagrams
    public static boolean anagram(String s1, String s2) {
        s1.toLowerCase();
        s2.toLowerCase();
        if(s1.length() == s2.length()){
            // convert string to Char array
            char ch1[] = s1.toCharArray();
            char ch2[] = s2.toCharArray();
            // Sort char array
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            //check arrays are equal 
            if(Arrays.equals(ch1, ch2)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }


    public static void main (String agrs[]) {
        Scanner sc = new Scanner (System.in);
        // String str = new String();
        // System.out.println("Enter a String: ");
        // str = sc.nextLine();
        // System.out.println("Count of lowercase vowel is : " + lowerCase_vowel(str));
        

        // String str = "ApnaCollege".replace("l", "");
        // System.out.println(str);

        String s1 = "race";
        String s2 = "care";
        System.out.println(anagram(s1, s2));

        sc.close();
    }
}
