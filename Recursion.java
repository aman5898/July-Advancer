public class Recursion{
    public static void main(String[] args){
        printIncreasing(5);
    }

    public static void printIncreasing(int n){
        // base case
        if(n==0){
            return;
        }

        // this will work is my faith
        printIncreasing(n-1);

        System.out.println(n);

    }
}