class ReverseANumber {
    public static void main(String[] args) {
        
        int digit = 45642;
        int digitsCount =(int) (Math.log10(digit));
        
        System.out.println("Reverse digit using Recursion: " + digitReverse(digit, digitsCount));
        
        // iterative method to aquire same result
        int digitRev = 0;
        while(digit > 0) {
            int rem = digit%10;
            digitRev += (rem * (int)(Math.pow(10, digitsCount)));
            digit /= 10;
            digitsCount -= 1;
        }
        System.out.println("Reverse digit using Recursion: " + digitRev);
        
    }
    
    public static int digitReverse(int n, int multiplier) {
        if (n == 0) {
            return n;
        }
        int currentDigit = n%10;
        return currentDigit * (int)(Math.pow(10, multiplier)) + digitReverse(n/10, multiplier-1);
    }
}
