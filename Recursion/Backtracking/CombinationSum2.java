package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    // Backtracking function
    static void findCombination(int ind, int target, int[] arr,
                                List<List<Integer>> ans,
                                List<Integer> ds) {

        // Base case: target achieved
        if (target == 0) {
            ans.add(new ArrayList<>(ds)); // store COPY
            return;
        }

        for (int i = ind; i < arr.length; i++) {

            // Skip duplicates at same recursion level
            if (i > ind && arr[i] == arr[i - 1]) {
                continue;
            }

            // Stop if element exceeds target
            if (arr[i] > target) {
                break;
            }

            // Choose element
            ds.add(arr[i]);

            // Recurse to next index
            findCombination(i + 1, target - arr[i], arr, ans, ds);

            // Backtrack
            ds.remove(ds.size() - 1);
        }
    }

    // Main function
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates); // sort to handle duplicates

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        findCombination(0, target, candidates, ans, ds);

        return ans;
    }

    // Driver code
    public static void main(String[] args) {

        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> result = combinationSum2(arr, target);

        System.out.println(result);
    }
}