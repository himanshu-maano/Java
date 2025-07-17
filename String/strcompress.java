public class strcompress {

    public static String compress(String str ) {
        
        //time complexity -> O(n)  (loop runs only for n time, n->string length)
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {

            Integer count = 1;

            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));

            if(count > 1) {
                sb.append(count.toString());
            }

        }

        return sb.toString();
    }
    public static void main(String agrs[]) {
        String str = "aabbgggdv";
        System.out.println(compress(str));
    }
}
