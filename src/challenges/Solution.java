package challenges;

class Solution {
    
    public static int gcd(int num1, int num2) {

        // Base case
        if (num1 == num2) {
            return num1;
        }
        // Recursive case
        if (num1 > num2) {
            return gcd(num1-num2, num2);
        }
        else {
            return gcd(num1, num2-num1);
        }
    }

    public static void main( String args[] ) {
        int x = 56;
        int y = 42;
        int result = gcd(x, y);
        System.out.println("The GCD of " + x + " and " + y + " is:");
        System.out.println(result);
    }
}
