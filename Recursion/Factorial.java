public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n)); 

        // with iteration - 
        n = 10;
        int fibResult = 1;
        for(int i = n; i>1;i--) {
            fibResult *= i;
        }
        System.out.println(fibResult);
        
    }
    public static int fib(int n) {
        if(n==1) {
            return 1;
        }
        return n * fib(n-1);
    }
}
