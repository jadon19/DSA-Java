package Recursion.Backtracking;

import java.util.*;

public class CombinationSum {

    static void func(int index, int[] arr, int target,
                     List<Integer> curr,
                     List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if (index == arr.length) return;

        // take element
        if (arr[index] <= target) {
            curr.add(arr[index]);
            func(index, arr, target - arr[index], curr, result);
            curr.remove(curr.size() - 1);
        }

        // skip element
        func(index + 1, arr, target, curr, result);
    }

    public static void main(String[] args) {

        int[] arr = {2,3,6,7};
        int target = 7;

        List<List<Integer>> result = new ArrayList<>();

        func(0, arr, target, new ArrayList<>(), result);

        System.out.println(result);
    }
}
