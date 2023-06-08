public class OddOrEven  {

    public static void main(String[] args) {
        // as we know if any binary number has 1 at the end, it is odd, because all its left values are some power of 2 and they are even
        // so the last bit decide the odd or even nature of the number
        // just check if last bit is 1 or 0 by using & operator with the number

        int n = 45;

        System.out.println(isOdd(n));

    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

}
