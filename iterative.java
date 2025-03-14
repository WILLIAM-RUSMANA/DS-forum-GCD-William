public class iterative {
    public static void main(String[] args) {
        System.out.println(gcd(7, 2));
        System.out.println(gcd(73,34));
        System.out.println(gcd(-4, -2));
        System.out.println(gcd(39, 13));
        System.out.println(gcd(77, 11));
        System.out.println(gcd(3, 9));
    }
    public static int gcd(int num1, int num2) {
       num1 = Math.abs(num1);  // make num1 into absolute value
       num2 = Math.abs(num2);  // make num2 into absolute value

       while (num2 != 0) {
           int temp = num1;     // make a temporary variable to store the value of num1
           num1 = num2;         // Reassign num1 with value of num2
           num2 = temp % num2;  // Assign num2 with the result of temp modulo itself
       }

        return num1;   // return value of gcd
    }
}
