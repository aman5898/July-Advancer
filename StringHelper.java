public class StringHelper {
    public static void main(String[] args){
        String str = new String("Geeksteree");
        String str2 = "Geekster";

        System.out.println(str.length());

        System.out.println(str.charAt(0));

        System.out.println(str.charAt(str.length()-1));

        System.out.println(str.substring(2));

        System.out.println(str.substring(1,4));

        System.out.println(str.indexOf("ee"));

        // printChars("geekster");

        printSubstrings("geekster");

        System.out.println(isPalindrome("malayalam"));

        System.out.println(countPalindromicSubStrings("geekster"));


        String str1 = "abc";
        String str3 = "abc";
        String str4= new String("abc");
        String str5= new String("abc");
        System.out.println((str5==str4));
        System.out.println(str1);
        str1 = "def";
        System.out.println(str1);
        toggleCase("Geekster");
        System.out.println(toggleCaseBetter("Geekster"));

    }

    public static void toggleCase(String str){
        String res = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z'){
                res += (char)(ch-'a'+'A');
            }else {
                res += (char)(ch-'A'+'a');
            }
        }

        System.out.println(res);
    }

    public static String toggleCaseBetter(String str){
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z'){
                res.append((char)(ch-'a'+'A'));
            }else {
                res.append((char)(ch-'A'+'a'));
            }
        }
        return res.toString();
        // System.out.println(res);
    }

    public static void printChars(String s) {
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            System.out.println(ch);
        }
    }

    public static void printSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i, j));
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static int countPalindromicSubStrings(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str = s.substring(i, j);
                if(isPalindrome(str)==true){
                    count++;
                }
            }
        }

        return count;
    }
}
