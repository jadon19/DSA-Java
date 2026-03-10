package Recursion.Backtracking;

public class GenerateBinaryStrings {

    static void generate(int n, String str, int prev) {

        // base case
        if (str.length() == n) {
            System.out.println(str);
            return;
        }

        // always allowed to place 0
        generate(n, str + "0", 0);

        // place 1 only if previous was not 1
        if (prev == 0) {
            generate(n, str + "1", 1);
        }
    }

    public static void main(String[] args) {

        int n = 3;
        generate(n, "", 0);
    }
}