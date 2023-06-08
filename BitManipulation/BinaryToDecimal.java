public class BinaryToDecimal {
    public static void main(String[] args) {

        String a = "11";
        System.out.println(binaryToDecimal(a));
        System.out.println(Math.pow(2,0));

        // tap academy solution

        int result = 0;
        int powerOf2 = 1;

        for(int i = a.length()-1; i>=0; i--) {
            if(a.charAt(i) == '1') {
                result += powerOf2;
            }
            powerOf2 *= 2;
        }
        System.out.println("Decimal value of 11 is: " + result);
    }





    // self thought
    public static int binaryToDecimal(String a) {
        int power = 0;
        int decimal = 0;
        for(int i = a.length()-1; i>= 0; i--) {
            char cc = a.charAt(i);
            int finalCC = cc - '0';
            decimal += (finalCC * Math.pow(2, power));
            power++;
        }
        return decimal;
    }
}
