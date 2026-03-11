package Recursion.Backtracking;

import java.util.*;

public class Subsets2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), res);

        return res;
    }

    void backtrack(int start, int[] nums, List<Integer> cur, List<List<Integer>> res){

        res.add(new ArrayList<>(cur));

        for(int i = start; i < nums.length; i++){

            if(i > start && nums[i] == nums[i-1]) continue;

            cur.add(nums[i]);

            backtrack(i+1, nums, cur, res);

            cur.remove(cur.size()-1);
        }
    }
}