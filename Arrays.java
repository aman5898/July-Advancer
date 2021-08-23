import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        System.out.println("Hello World");
        int mark = 10;
        int[] marks = new int[10];
        // for(int i=0;i<10;i++){
        //     System.out.println(marks[i]);
        // }


        Scanner scn = new Scanner(System.in);
        // mark = scn.nextInt();
        // System.out.println(mark);


        // Out of bound
        int[] arr = {1,2,3,4,5};
        // System.out.println(arr[5]);

        // printing array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        
        // Printing reverse
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}