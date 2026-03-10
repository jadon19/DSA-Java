package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    static void generate(String s, int open, int close, int n, List<String> result) {

        // base case
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }

        // add opening bracket
        if (open < n) {
            generate(s + "(", open + 1, close, n, result);
        }

        // add closing bracket
        if (close < open) {
            generate(s + ")", open, close + 1, n, result);
        }
    }

    public static void main(String[] args) {

        int n = 3;
        List<String> result = new ArrayList<>();

        generate("", 0, 0, n, result);

        System.out.println(result);
    }
}