package Recursion;
public class MyPow {

    // Helper method to calculate power using recursion
    private double power(double x, long n) {

        // Base case: anything raised to 0 is 1
        if (n == 0) return 1.0;

        // Base case: anything raised to 1 is itself
        if (n == 1) return x;

        // If n is even
        if (n % 2 == 0) {
            return power(x * x, n / 2);
        }

        // If n is odd
        return x * power(x, n - 1);
    }

    // Method to compute x^n
    public double myPow(double x, int n) {

        long N = n; // convert to long to safely handle Integer.MIN_VALUE

        if (N < 0) {
            return 1.0 / power(x, -N);
        }

        return power(x, N);
    }

    public static void main(String[] args) {

        MyPow sol = new MyPow();

        double x = 2.0;
        int n = 10;

        double result = sol.myPow(x, n);

        System.out.println(x + "^" + n + " = " + result);
    }
}