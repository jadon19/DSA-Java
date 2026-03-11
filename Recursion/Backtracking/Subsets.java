package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    static void backtrack(int start, int[] nums, List<Integer> cur, List<List<Integer>> res) {

        // Add current subset
        res.add(new ArrayList<>(cur));

        for (int i = start; i < nums.length; i++) {

            // choose element
            cur.add(nums[i]);

            // explore further
            backtrack(i + 1, nums, cur, res);

            // undo choice (backtrack)
            cur.remove(cur.size() - 1);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), res);

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = subsets(nums);

        System.out.println(result);
    }
}