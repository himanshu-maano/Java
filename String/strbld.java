public class strbld {

    public static String toUppercase(String str) {
        
        // time complexity -> O(n)  linear time

        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ') {
                sb.append(str.charAt(i));
                sb.append(Character.toUpperCase(str.charAt(++i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }


    public static void main (String agrs[]) {
        String  str = "hello, I am himanshu";
        System.out.println(toUppercase(str));
    }

}