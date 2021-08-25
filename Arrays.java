import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        // System.out.println("Hello World");
        // int mark = 10;
        // int[] marks = new int[10];
        // // for(int i=0;i<10;i++){
        // //     System.out.println(marks[i]);
        // // }


        // Scanner scn = new Scanner(System.in);
        // // mark = scn.nextInt();
        // // System.out.println(mark);


        // // Out of bound
        // int[] arr = {1,2,3,4,5};
        // // System.out.println(arr[5]);

        // // printing array
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // System.out.println();

        // // Printing reverse
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }

        // System.out.println();
        // // for each loop
        // for(int val:arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();
        // boolean bl = targetSum(marks, 3);
        // System.out.println(bl);

        // int[] arr = {3,4,5,6,7,81,5};
        // Scanner scn = new Scanner(System.in);
        // int[] prefixSm = new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     if(i==0){
        //         prefixSm[i]= arr[i];
        //     }else{
        //         prefixSm[i] = prefixSm[i-1]+arr[i];
        //     }
        // }

        // int q = scn.nextInt();
        // for(int i=0;i<q;i++){
        //     int l = scn.nextInt();
        //     int r = scn.nextInt();
        //     if(l==0){
        //         System.out.println(prefixSm[r]);
        //     }else{
        //         int res = prefixSm[r]-prefixSm[l-1];
        //         System.out.println(res);
        //     }
        //     // int res = SumInRange(arr, l, r);
            
        // }

        int[] arr = {1,2,0,4,3,0,5,0};
        pushZeroesToEnd(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
        
    }

    public static void pushZeroesToEnd(int[] arr){
        int countNZeroes = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                countNZeroes++;
                swap(arr,countNZeroes-1,i);
            }
        }
    }

    public static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean targetSum(int[] arr, int target) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                System.out.println(arr[i]+ " "+arr[j]);
                if(sum==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static int SumInRange(int[] arr,int l, int r){
        int sum = 0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        return sum;
    }
}