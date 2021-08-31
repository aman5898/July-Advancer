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

        printChars("geekster");

    }

    public static void printChars(String s) {
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            System.out.println(ch);
        }
    }

    public static void printSubstrings(String s) {
        
    }
}
