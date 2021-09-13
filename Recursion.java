public class Recursion {
    public static void main(String[] args) {
        // printIncreasing(5);
        // printDecreasing(5);
        // System.out.println(factorial(5));
        // System.out.println(power(3,3));
        // System.out.println(powerBtr(3, 5));
        System.out.println(fib(6));
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
}