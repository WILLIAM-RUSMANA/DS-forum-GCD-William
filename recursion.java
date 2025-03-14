public class recursion {
    public static void main(String[] args) {
        // Test Cases
        System.out.println(gcd(7, 2));
        System.out.println(gcd(73,34));
        System.out.println(gcd(-4, -2));
        System.out.println(gcd(39, 13));
        System.out.println(gcd(77, 11));
    }

    public static int gcd(int num1, int num2) {
        num1 = Math.abs(num1);  // make num1 into absolute value
        num2 = Math.abs(num2);  // make num2 into absolute value

        // base case: if either num 1 or 2 is 0
        if (num1 == 0) { return num2; } // if num1 is zero return num2
        else if (num2 == 0) { return num1; } // if num2 is zero return num1

        int minimum = Math.min(num1, num2);      // return the minimum value of the two numbers
        int maximum = Math.max(num1, num2);      // return the maximum value of the two numbers
        return gcd(minimum, maximum % minimum);  // Call on itself with params minimum, maximum modulo minimum
    }
}

