import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringHelper {
    public static void main(String[] args) {
        String str = new String("Geeksteree");
        String str2 = "Geekster";

        System.out.println(str.length());

        System.out.println(str.charAt(0));

        System.out.println(str.charAt(str.length() - 1));

        System.out.println(str.substring(2));

        System.out.println(str.substring(1, 4));

        System.out.println(str.indexOf("ee"));

        // printChars("geekster");

        printSubstrings("geekster");

        System.out.println(isPalindrome("malayalam"));

        System.out.println(countPalindromicSubStrings("geekster"));

        String str1 = "abc";
        String str3 = "abc";
        String str4 = new String("abc");
        String str5 = new String("abc");
        System.out.println((str5 == str4));
        System.out.println(str1);
        str1 = "def";
        // System.out.println(str1);
        // toggleCase("Geekster");
        // System.out.println(toggleCaseBetter("Geekster"));
        // System.out.println(OddEven("Geekster"));
        // System.out.println(InsertDiff("abcd"));
        // System.out.println(Compression("aabcd"));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.set(0, 50));
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Abc");
        list2.add("def");
        System.out.println(list2);
        for(int val:list){
            System.out.print(val+" ");
        }
        System.out.println();

        System.out.println(list.remove(1));
        System.out.println(list);
    }

    

    public static String Compression(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                continue;
            } else {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            }
        }

        sb.append(str.charAt(str.length() - 1));
        sb.append(count);
        return sb.toString();
    }

    public static String InsertDiff(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (i != str.length() - 1) {
                sb.append(str.charAt(i + 1) - str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String OddEven(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 != 0) {

                sb.append((char) (ch + 1));
            } else {
                sb.append((char) (ch - 1));
            }
        }
        return sb.toString();
    }

    public static void toggleCase(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                res += (char) (ch - 'a' + 'A');
            } else {
                res += (char) (ch - 'A' + 'a');
            }
        }

        System.out.println(res);
    }

    public static String toggleCaseBetter(String str) {
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                res.append((char) (ch - 'a' + 'A'));
            } else {
                res.append((char) (ch - 'A' + 'a'));
            }
        }
        return res.toString();
        // System.out.println(res);
    }

    public static void printChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }
    }

    public static void printSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static int countPalindromicSubStrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                if (isPalindrome(str) == true) {
                    count++;
                }
            }
        }

        return count;
    }
}
