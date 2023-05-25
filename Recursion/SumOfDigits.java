public class SumOfDigits {
    public static void main(String[] args) {
        
        int digit = 65567;
        System.out.println(sum(digit));

        // lets try without recursion (iterative approach)

        int sum = 0;
        while(digit > 0) {
            sum += digit%10;
            digit /= 10;
        }
        System.out.println(sum);

    }

    public static int sum(int n) {
        if (n == 0) {
            return n;
        }
        int currDigit = n%10;
        return currDigit + sum(n/10);
    }
}
