public class MemoryDiscussion {
    public static void main(String[] args){
        // int[] arr = {10,20,30,40,50};
        // int val = 10;
        // fun1(arr);
        // printArray(arr);
        // System.out.println(val);
        // fun2(arr,val);
        // printArray(arr);
        // System.out.println(val);
        int[] arr = {1,2,3,4,5};

        int[] arr2 = {10,20,30,4,5,6,7,8,9,10};
        arr = arr2;
        System.out.println(arr[0]);
    }

    public static void fun1(int[] arr){
        arr[0] = 5; 
    }

    public static void fun2(int[] arr,int val){
        arr[1] = 10;
        val =5;
    }

    public static void printArray(int[] arr){
        System.out.println();
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
