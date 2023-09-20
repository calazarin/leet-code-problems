package com.lazarin.practicing.leetcode.backtracking.medium;


import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/
public class Subsets {

    //T: n * 2^n; either you pick a choicer or not
    //S: O(n)
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> answer = new ArrayList();
        backtrack(0, new ArrayList(), nums, answer);
        return answer;
    }

    private void backtrack(int start, List<Integer> subset, int[] nums, List<List<Integer>> answer){

        answer.add(new ArrayList(subset));

        for(int i = start; i < nums.length; i++){
            //include the number
            subset.add(nums[i]);

            backtrack(i + 1, subset, nums, answer);
            //not include the number
            subset.remove(subset.size() - 1);
        }
    }

}
