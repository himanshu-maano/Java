// import java.util.*;

class Strings {

    public static void printLetter(String s) {
        for(int i=0; i<s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }


    public static void main (String[] agrs) {
        // String s1 = "hello";
        // String s2 = "hello";
        // s1 = "world";
        // String s3 = new String("hello");
        // System.out.println(s1);
        // System.out.println(s1==s3);


        // String fullName = "Himanshu Kumar";
        // System.out.println(fullName.length());  // .length() used to finds length of string


        // taking input
        // Scanner sc = new Scanner(System.in);
        // String str;
        // str = sc.nextLine();  //input command
        // System.out.println(str);


        // Concatenation
        // String s1 = "hello";
        // String s2 = "himanshu";
        // System.out.println(s2);
        // s2 = s1.concat(s2);  // concatenate using concat() method
        // System.out.println(s2);
        // String s3 = s1 + " " + "world!";  // concatenate using + operator
        // System.out.println(s3);


        // .charAt() <- print value of index it is pointed

        // System.out.println(s1.charAt(4));
        // printLetter(s1);


        // .equals() <- compares content or value of string

        // String s1 = "i am maano";
        // String s2 = new String("i am maano");
        // System.out.println(s1 == s2); // here it compares strings object
        // System.out.println(s1.equals(s2)); // here it compares strings value/content


        // .substring(beginIndex, endIndex) <- return mention part of string

        // String s1 = "Naruto";
        // System.out.println(s1.substring(2, 5));
        // System.out.println(s1.substring(2));



        String fruits[] = {"apple", "banana", "Mango", "guava"};
        String largest = fruits[0];

        for(int i=1; i<fruits.length; i++) {
            if(largest.compareToIgnoreCase(fruits[i]) < 0) {  //compareTo compares two string
                largest = fruits[i];                          //lexicographically (case sensitive)
            }                                                 //compareToIgnoreCase <- ignores upper or lower case
        }
        
        System.out.println(largest);
    }
}