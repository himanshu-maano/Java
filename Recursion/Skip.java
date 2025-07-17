class Skip {
    static void skipA(String str, StringBuilder ans) {
        if(str.isEmpty()){
            System.out.println(ans.toString());
            return;
        }
        char ch = str.charAt(0);

        if(ch != 'a'){
            skipA(str.substring(1), ans.append(ch));
        } else{
            skipA(str.substring(1), ans.append(""));
        }
    }

    static String skipA2(String str) {
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);

        if(ch != 'a'){
            return ch + skipA2(str.substring(1));
        } else{
            return skipA2(str.substring(1));
        }
    }

    static String skipCat(String str) {
        if(str.isEmpty()){
            return "";
        }

        String s = str.length() > 2 ? str.substring(0,3) : str.substring(0);

        if(s.equals("cat")){
            return  skipCat(str.substring(3));
        } else{
            return str.charAt(0) + skipCat(str.substring(1));
        }
    }

    static String skipAppNotApple(String str) {
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return  skipAppNotApple(str.substring(3));
        } else{
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }


    public static void main(String[] args){
        String org = "bcappplecat";
        System.out.println(skipAppNotApple(org));
    }
}
