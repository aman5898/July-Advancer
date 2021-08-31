public class StringHelper {
    public static void main(String[] args){
        String str = new String("Geeksteree");
        String str2 = "Geekster";

        System.out.println(str.length());

        System.out.println(str.charAt(0));

        System.out.println(str.charAt(str.length()-1));

        System.out.println(str.substring(2));

        System.out.println(str.substring(1,3));

        System.out.println(str.indexOf("ee"));

    }
}
