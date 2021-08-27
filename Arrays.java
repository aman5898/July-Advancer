import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // int mark = 10;
        // int[] marks = new int[10];
        // // for(int i=0;i<10;i++){
        // // System.out.println(marks[i]);
        // // }

        // Scanner scn = new Scanner(System.in);
        // // mark = scn.nextInt();
        // // System.out.println(mark);

        // // Out of bound
        // int[] arr = {1,2,3,4,5};
        // // System.out.println(arr[5]);

        // // printing array
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }

        // System.out.println();

        // // Printing reverse
        // for(int i=arr.length-1;i>=0;i--){
        // System.out.print(arr[i]+" ");
        // }

        // System.out.println();
        // // for each loop
        // for(int val:arr){
        // System.out.print(val+" ");
        // }
        // System.out.println();
        // boolean bl = targetSum(marks, 3);
        // System.out.println(bl);

        // int[] arr = {3,4,5,6,7,81,5};
        // Scanner scn = new Scanner(System.in);
        // int[] prefixSm = new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        // if(i==0){
        // prefixSm[i]= arr[i];
        // }else{
        // prefixSm[i] = prefixSm[i-1]+arr[i];
        // }
        // }

        // int q = scn.nextInt();
        // for(int i=0;i<q;i++){
        // int l = scn.nextInt();
        // int r = scn.nextInt();
        // if(l==0){
        // System.out.println(prefixSm[r]);
        // }else{
        // int res = prefixSm[r]-prefixSm[l-1];
        // System.out.println(res);
        // }
        // // int res = SumInRange(arr, l, r);

        // }

        // int[] arr = {1,2,0,4,3,0,5,0};
        // pushZeroesToEnd(arr);
        // for(int val:arr){
        // System.out.print(val+" ");
        // }

        // int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        // System.out.println(KadanesAlgo(arr));

        // int[][] arr = new int[3][4];
        // for(int i=0;i<arr.length;i++){
        // for(int j=0;j<arr[0].length;j++){
        // System.out.print(arr[i][j]+" ");
        // }
        // System.out.println();
        // }

        // System.out.println();

        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // int sum = 0;
        // // sum of first diagonal
        // for(int i=0;i<arr.length;i++){
        // for(int j=0;j<arr[0].length;j++){
        // if(i==j){
        // sum+= arr[i][j];
        // }
        // }
        // }

        // System.out.println(sum);

        // Printing Cordinates of other diagonal
        // for(int i=0;i<arr.length;i++){
        // for(int j=0;j<arr[0].length;j++){
        // if(i+j==arr.length-1){
        // System.out.print(i+""+j+" ");
        // }
        // }
        // System.out.println();
        // }

        // Print wave

        // int[][] arr = { { 1, 2, 3,4 }, { 5, 6, 7,8 }, { 9, 10, 11,12 } };
        // boolean flag = false;

        // for (int j = 0; j < arr[0].length; j++) {
        // if (flag == false) {
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // } else {

        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.print(arr[i][j] + " ");
        // }
        // }
        // flag = !flag;
        // }

        // System.out.println();
        // flag = false;
        // for (int j = arr[0].length-1; j >=0; j--) {
        // if (flag == false) {
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // } else {

        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.print(arr[i][j] + " ");
        // }
        // }
        // flag = !flag;
        // }

        // PrintSpiral

        // int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        // int sr = 0;
        // int sc = 0;
        // int er = arr.length - 1;
        // int ec = arr[0].length - 1;

        // while (sr <= er && sc <= ec) {
        //     if (sr <= er && sc <= ec) {
        //         for (int i = sc; i <= ec; i++) {
        //             System.out.print(arr[sr][i] + " ");
        //         }
        //         sr++;
        //     }

        //     if (sr <= er && sc <= ec) {
        //         for (int i = sr; i <= er; i++) {
        //             System.out.print(arr[i][ec] + " ");
        //         }
        //         ec--;
        //     }
        //     if (sr <= er && sc <= ec) {
        //         for (int i = ec; i >= sc; i--) {
        //             System.out.print(arr[er][i] + " ");
        //         }
        //         er--;
        //     }
        //     if (sr <= er && sc <= ec) {
        //         for (int i = er; i >= sr; i--) {
        //             System.out.print(arr[i][sc] + " ");
        //         }
        //         sc++;
        //     }
        // }

        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,0,0},{0,1,0},{0,0,1}};
        MatrixMultiplication(arr1, arr2);

    }

    public static void MatrixMultiplication(int[][] arr1,int[][] arr2){
        int[][] res = new int[arr1.length][arr2[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                res[i][j] = 0;
                for(int k=0;k<arr1[0].length;k++){
                    res[i][j]+= arr1[i][k]*arr2[k][j];
                }
            }
        }

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int KadanesAlgo(int[] arr) {
        // not writing for all negative array
        int maxOverall = Integer.MIN_VALUE;
        int sumTillNow = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTillNow += arr[i];
            maxOverall = Math.max(maxOverall, Math.max(sumTillNow, arr[i]));
            if (sumTillNow < 0) {
                sumTillNow = 0;
            }
            // maxOverall = Math.max(maxOverall, sumTillNow);
        }

        return maxOverall;
    }

    public static void pushZeroesToEnd(int[] arr) {
        int countNZeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                countNZeroes++;
                swap(arr, countNZeroes - 1, i);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean targetSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                System.out.println(arr[i] + " " + arr[j]);
                if (sum == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int SumInRange(int[] arr, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        return sum;
    }
}