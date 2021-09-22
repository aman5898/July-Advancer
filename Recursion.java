import java.util.ArrayList;

public class Recursion {
    public static void main(String[] args) {
        // printIncreasing(5);
        // printDecreasing(5);
        // System.out.println(factorial(5));
        // System.out.println(power(3,3));
        // System.out.println(powerBtr(3, 5));
        // System.out.println(fib(6));
        // int[] arr = {1,2,30,4,6};
        // printArray(arr, 0);
        // printreverse(arr,0);
        // System.out.println(max(arr,0));
        // int[] arr = {1,1,3,3,5,1,3};
        // // System.out.println(find(arr,1,0));
        // // System.out.println(firstIndex(arr, 30, 0));
        // // System.out.println(lastIndex(arr, 3, 0));
        // int[] ret = allIndices(arr,0,3,0);
        // for(int val:ret){
        // System.out.print(val+" ");
        // }
        // System.out.println();
        // String str="abc";
        // System.out.println(getSS(str));
        // System.out.println(getKPC("123"));
        // System.out.println(getPerm("abc"));
        // System.out.println(getBoardPaths(0, 10));
        // System.out.println(getMazePaths(0,0,2,2));
        // System.out.println(getMazePathsWithDiagonals(0,0,2,2));
        // printSS("abc","");
        // printPermutations("abc", "");
        // printKPC("12","");
        // int[] arr = { 10, 20, 30, 40, 5, 11, 6, 9 };
        // printTargetSS(arr, 0, 60, "");

        // printBoardPaths(0, 10, "");
        // printBoardPathsPro(0, 10, "");
        // printMazePaths(0,0,2,2,"");
        // boolean[][] board = new boolean[4][4];
        // printNQueens(board, 0, "");
        towerOfHanoi(5,'A','B','C');
    }

    public static void printIncreasing(int n) {
        // base case
        if (n == 0) {
            return;
        }

        // this will work is my faith
        printIncreasing(n - 1);

        System.out.println(n);

    }

    public static void printDecreasing(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);

        // This is my faith call
        printDecreasing(n - 1);
    }

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        // faith
        int fnm1 = factorial(n - 1);
        return n * fnm1;
    }

    public static int power(int n, int k) {
        if (k == 0) {
            return 1;
        }
        int nkm1 = power(n, k - 1);

        return nkm1 * n;
    }

    public static int powerBtr(int n, int k) {
        if (k == 0) {
            return 1;
        }
        int pdb2 = powerBtr(n, k / 2);
        if (k % 2 == 0) {
            return pdb2 * pdb2;
        } else {
            return pdb2 * pdb2 * n;
        }
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        return fibnm1 + fibnm2;
    }

    public static void printArray(int[] arr, int vidx) {
        if (vidx == arr.length) {
            return;
        }

        System.out.println(arr[vidx]);
        printArray(arr, vidx + 1);
    }

    public static void printreverse(int[] arr, int vidx) {
        if (vidx == arr.length) {
            return;
        }

        printreverse(arr, vidx + 1);
        System.out.println(arr[vidx]);
    }

    public static int max(int[] arr, int vidx) {

        if (vidx == arr.length - 1) {
            return arr[vidx];
        }

        int maxOfRest = max(arr, vidx + 1);
        return Math.max(maxOfRest, arr[vidx]);
    }

    public static boolean find(int[] arr, int val, int vidx) {

        if (vidx == arr.length) {
            return false;
        }

        if (arr[vidx] == val) {
            return true;
        }

        return find(arr, val, vidx + 1);
    }

    public static int firstIndex(int[] arr, int val, int vidx) {
        if (vidx == arr.length) {
            return -1;
        }

        if (arr[vidx] == val) {
            return vidx;
        }

        return firstIndex(arr, val, vidx + 1);
    }

    public static int lastIndex(int[] arr, int val, int vidx) {
        if (vidx == arr.length) {
            return -1;
        }

        int res = lastIndex(arr, val, vidx + 1);
        if (res == -1) {
            if (arr[vidx] == val) {
                return vidx;
            } else {
                return -1;
            }
        } else {
            return res;
        }
    }

    public static int[] allIndices(int[] arr, int vidx, int data, int fsf) {
        if (vidx == arr.length) {
            int[] retArr = new int[fsf];
            return retArr;
        }

        if (arr[vidx] == data) {
            int[] retArr = allIndices(arr, vidx + 1, data, fsf + 1);
            retArr[fsf] = vidx;
            return retArr;
        } else {
            int[] retArr = allIndices(arr, vidx + 1, data, fsf);
            return retArr;
        }
    }

    public static ArrayList<String> getSS(String str) {
        if (str.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = getSS(ros);

        ArrayList<String> mr = new ArrayList<>();
        for (String s : rr) {
            mr.add(s);
            mr.add(ch + s);
        }

        return mr;

    }

    public static ArrayList<String> getKPC(String str) {

        if (str.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = getKPC(ros);
        String choices = getChoice(ch);

        ArrayList<String> mr = new ArrayList<>();

        for (String s : rr) {
            for (int i = 0; i < choices.length(); i++) {
                mr.add(choices.charAt(i) + s);
            }
        }

        return mr;
    }

    public static String getChoice(char key) {
        if (key == '1') {
            return "abc";
        } else if (key == '2') {
            return "def";
        } else if (key == '3') {
            return "ghi";
        } else if (key == '4') {
            return "jkl";
        } else if (key == '5') {
            return "mno";
        } else if (key == '6') {
            return "pqr";
        } else if (key == '7') {
            return "stu";
        } else if (key == '8') {
            return "vwx";
        } else if (key == '9') {
            return "yz";
        } else if (key == '0') {
            return "abc";
        }

        return "";
    }

    public static ArrayList<String> getPerm(String s) {

        if (s.length() == 0) {
            ArrayList<String> br = new ArrayList<String>();
            br.add("");
            return br;
        }
        char ch = s.charAt(0);
        String ros = s.substring(1);

        ArrayList<String> rr = getPerm(ros);
        ArrayList<String> mr = new ArrayList<String>();
        for (String str : rr) {
            for (int i = 0; i <= str.length(); i++) {
                String finalString = str.substring(0, i) + ch + str.substring(i);
                mr.add(finalString);
            }
        }

        return mr;
    }

    public static ArrayList<String> getBoardPaths(int curr, int end) {

        if (curr == end) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        if (curr > end) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> mr = new ArrayList<String>();
        for (int dice = 1; dice <= 6; dice++) {
            ArrayList<String> rr = getBoardPaths(curr + dice, end);
            for (String str : rr) {
                mr.add(dice + str);
            }
        }

        return mr;
    }

    public static ArrayList<String> getMazePaths(int cr, int cc, int er, int ec) {

        if (cr == er && cc == ec) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        if (cr > er || cc > ec) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> mr = new ArrayList<>();

        ArrayList<String> rrd = getMazePaths(cr + 1, cc, er, ec);
        for (String str : rrd) {
            mr.add("D" + str);
        }

        ArrayList<String> rrr = getMazePaths(cr, cc + 1, er, ec);
        for (String str : rrr) {
            mr.add("R" + str);
        }

        return mr;
    }

    public static ArrayList<String> getMazePathsWithDiagonals(int cr, int cc, int er, int ec) {

        if (cr == er && cc == ec) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        if (cr > er || cc > ec) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> mr = new ArrayList<>();

        ArrayList<String> rrd = getMazePathsWithDiagonals(cr + 1, cc, er, ec);
        for (String str : rrd) {
            mr.add("V" + str);
        }

        ArrayList<String> rrr = getMazePathsWithDiagonals(cr, cc + 1, er, ec);
        for (String str : rrr) {
            mr.add("H" + str);
        }

        ArrayList<String> rr = getMazePathsWithDiagonals(cr + 1, cc + 1, er, ec);
        for (String str : rr) {
            mr.add("D" + str);
        }

        return mr;
    }

    public static void printSS(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String ros = ques.substring(1);

        printSS(ros, ans + ch);
        printSS(ros, ans);
    }

    public static void printPermutations(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String ros = ques.substring(0, i) + ques.substring(i + 1);
            printPermutations(ros, ans + ch);
        }
    }

    public static void printKPC(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String ros = ques.substring(1);
        String choices = getChoice(ch);
        for (int i = 0; i < choices.length(); i++) {
            char choice = choices.charAt(i);
            printKPC(ros, ans + choice);
        }

    }

    public static void printTargetSS(int[] arr, int vidx, int target, String asf) {
        if (vidx == arr.length) {
            if (target == 0) {
                System.out.println(asf);
            }
            return;
        }

        printTargetSS(arr, vidx + 1, target - arr[vidx], asf + "\t" + arr[vidx]);
        printTargetSS(arr, vidx + 1, target, asf);
    }

    // Reactive Code
    public static void printBoardPaths(int curr, int end, String ans) {
        if (curr == end) {
            System.out.println(ans);
            return;
        }

        if (curr > end) {
            return;
        }

        for (int i = 1; i <= 6; i++) {
            printBoardPaths(curr + i, end, ans + i);
        }
    }

    // ProActive Code
    public static void printBoardPathsPro(int curr, int end, String ans) {
        if (curr == end) {
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= 6; i++) {
            if (curr + i <= end) {
                printBoardPaths(curr + i, end, ans + i);
            }
        }
    }

    public static void printMazePaths(int cr, int cc, int er, int ec, String psf) {
        if (cr == er && cc == ec) {
            System.out.println(psf);
            return;
        }

        if (cr > ec || cc > ec) {
            return;
        }
        printMazePaths(cr + 1, cc, er, ec, psf + "V");
        printMazePaths(cr, cc + 1, er, ec, psf + "H");
    }

    public static void printNQueens(boolean[][] board, int row, String asf) {
        if (row == board.length) {
            System.out.println(asf);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isItSafe(board, row, j) == true) {
                board[row][j] = true;
                printNQueens(board, row + 1, asf + row + "" + j + " ");
                board[row][j] = false;
            }
        }
    }

    private static boolean isItSafe(boolean[][] board, int row, int col) {
        // my col
        for (int i = 0; i < row; i++) {
            if (board[i][col] == true) {
                return false;
            }
        }
        // first diagonal
        int i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == true) {
                return false;
            }
            i--;
            j--;
        }
        // second diagonal
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < board.length) {
            if (board[i][j] == true) {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }

    public static void towerOfHanoi(int n, char start, char end, char helper) {
        if(n==0){
            return;
        }
        towerOfHanoi(n-1, start, helper, end);
        System.out.println(n+"th disk move from "+start+" to "+end);
        towerOfHanoi(n-1, helper, end, start);
    }

}