public class RemoveDuplicates {
    public static void main(String[] args){
        String s = "himanshu";
        removeDuplicates(s, 0, new StringBuilder(""), new boolean[26]);

        /*
        //remove Duplicate using loop
        StringBuilder sb = new StringBuilder();
        boolean map[] = new boolean[26];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!map[c - 'a']){
                map[c - 'a'] = true;
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        */
    }

    public static void removeDuplicates(String s, int idx, StringBuilder sb, boolean[] map){
        if(idx == s.length()){
            System.out.println(sb.toString());
            return;
        }

        char currChar = s.charAt(idx);
        if(!map[currChar - 'a']){
            map[currChar - 'a'] = true;
            removeDuplicates(s, idx+1, sb.append(currChar), map);
        }
        else{
            removeDuplicates(s, idx+1, sb, map);
        }
    }
}
