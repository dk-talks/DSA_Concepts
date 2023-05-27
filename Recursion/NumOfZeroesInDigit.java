// count the number of zeroes in a digit...

class NumOfZeroesInDigit {
    public static void main(String[] args) {
        int digit = 7040020;
        int result = numberOfZeroes(digit);
        System.out.println("Number of zeroes in digits is: " + result);
        
        // lets try without recursion - (iteration method)
        int sum = 0;
        while(digit > 0) {
            if(digit%10 == 0) {
                sum += 1;
            }
            digit /= 10;
        }
        System.out.println("Iterative Result is: " + sum);
        
    }
     // recursion function
    public static int numberOfZeroes(int n) {
        if(n == 0) {
            return 0;
        }
        if(n%10 == 0){
            return 1+numberOfZeroes(n/10);
        } else {
            return numberOfZeroes(n/10);
        }
        
    }
}
