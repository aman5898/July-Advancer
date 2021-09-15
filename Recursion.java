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
        //     System.out.print(val+" ");
        // }
        // System.out.println();
        // String str="abc";
        // System.out.println(getSS(str));
        // System.out.println(getKPC("123"));
        System.out.println(getPerm("abc"));
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

    public static int factorial(int n){

        if(n==0){
            return 1;
        }

        // faith
        int fnm1 = factorial(n-1);
        return n*fnm1;
    }

    public static int power(int n, int k){
        if(k==0){
            return 1;
        }
        int nkm1 = power(n,k-1);

        return nkm1*n;
    }

    public static int powerBtr(int n, int k){
        if(k==0){
            return 1;
        }
        int pdb2 = powerBtr(n,k/2);
        if(k%2==0){
            return pdb2*pdb2;
        }else{
            return pdb2*pdb2*n;
        }
    }

    public static int fib(int n) {
        if(n==0||n==1){
            return 1;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        return fibnm1 + fibnm2;
    }

    public static void printArray(int[] arr,int vidx){
        if(vidx==arr.length){
            return;
        }

        System.out.println(arr[vidx]);
        printArray(arr, vidx+1);
    }

    public static void printreverse(int[] arr, int vidx){
        if(vidx==arr.length){
            return;
        }
        
        printreverse(arr, vidx+1);
        System.out.println(arr[vidx]);
    }

    public static int max(int[] arr,int vidx){

        if(vidx==arr.length-1){
            return arr[vidx];
        }

        int maxOfRest = max(arr,vidx+1);
        return Math.max(maxOfRest, arr[vidx]);
    }

    public static boolean find(int[] arr, int val,int vidx){

        if(vidx==arr.length){
            return false;
        }

        if(arr[vidx]==val){
            return true;
        }

        return find(arr,val,vidx+1);
    }

    public static int firstIndex(int[] arr,int val,int vidx){
        if(vidx==arr.length){
            return -1;
        }

        if(arr[vidx]==val){
            return vidx;
        }

        return firstIndex(arr,val,vidx+1);
    }

    public static int lastIndex(int[] arr,int val,int vidx){
        if(vidx==arr.length){
            return -1;
        }


        int res = lastIndex(arr,val,vidx+1);
        if(res==-1){
            if(arr[vidx]==val){
                return vidx;
            }else{
                return -1;
            }
        }else{
            return res;
        }
    }

    public static int[] allIndices(int[] arr, int vidx, int data, int fsf) {
        if(vidx==arr.length){
            int[] retArr = new int[fsf];
            return retArr;
        }

        if(arr[vidx]==data){
            int[] retArr = allIndices(arr,vidx+1,data,fsf+1);
            retArr[fsf] = vidx;
            return retArr;
        }else{
            int[] retArr = allIndices(arr,vidx+1,data,fsf);
            return retArr;
        }
    }

    public static ArrayList<String> getSS(String str){
        if(str.length()==0){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = getSS(ros);     
       
       
       
        ArrayList<String> mr = new ArrayList<>();
        for(String s:rr){
            mr.add(s);
            mr.add(ch+s);
        }

        return mr;

    }
    public static ArrayList<String> getKPC(String str) {

        if(str.length()==0){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = getKPC(ros);
        String choices = getChoice(ch);

        ArrayList<String> mr = new ArrayList<>();

        for(String s:rr){
            for(int i=0;i<choices.length();i++){
                mr.add(choices.charAt(i)+s);
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
        for(String str:rr){
            for(int i=0;i<=str.length();i++){
                String finalString = str.substring(0,i)+ch+str.substring(i);
                mr.add(finalString);
            }
        }

        return mr;
    }
}