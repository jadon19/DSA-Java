package Recursion;

public class CountGoodNumbers {

    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evenPart = power(5, evenPositions);
        long oddPart = power(4, oddPositions);

        return (int) ((evenPart * oddPart) % MOD);
    }

    private long power(long base, long exp) {

        long result = 1;

        while (exp > 0) {

            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp = exp >> 1;
        }

        return result;
    }

    public static void main(String[] args) {

        CountGoodNumbers obj = new CountGoodNumbers();

        System.out.println(obj.countGoodNumbers(1)); // 5
        System.out.println(obj.countGoodNumbers(4)); // 400
    }
}
