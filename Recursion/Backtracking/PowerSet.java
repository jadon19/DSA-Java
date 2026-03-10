package Recursion.Backtracking;

import java.util.*;

public class PowerSet {

    static void generate(String s, int index, String curr, List<String> result) {

        // base case
        if (index == s.length()) {
            result.add(curr);
            return;
        }

        // take character
        generate(s, index + 1, curr + s.charAt(index), result);

        // skip character
        generate(s, index + 1, curr, result);
    }

    public static void main(String[] args) {

        String s = "abc";
        List<String> result = new ArrayList<>();

        generate(s, 0, "", result);

        System.out.println(result);
    }
}
