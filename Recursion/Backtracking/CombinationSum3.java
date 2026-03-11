package Recursion.Backtracking;

import java.util.*;

public class CombinationSum3 {

    static void backtrack(int start, int sum, int k, int n,
                          List<Integer> cur, List<List<Integer>> res) {

        if (sum == n && cur.size() == k) {
            res.add(new ArrayList<>(cur));
            return;
        }

        if (sum > n || cur.size() > k) {
            return;
        }

        for (int i = start; i <= 9; i++) {

            cur.add(i);

            backtrack(i + 1, sum + i, k, n, cur, res);

            cur.remove(cur.size() - 1);
        }
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> res = new ArrayList<>();

        backtrack(1, 0, k, n, new ArrayList<>(), res);

        return res;
    }

    public static void main(String[] args) {

        System.out.println(combinationSum3(3,7));
    }
}
