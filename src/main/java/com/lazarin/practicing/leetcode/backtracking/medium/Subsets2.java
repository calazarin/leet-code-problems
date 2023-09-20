package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/subsets-ii/description/
public class Subsets2 {

    //T: n * 2^n; either you pick a choicer or not
    //S: O(2^n)
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer = new ArrayList();
        Arrays.sort(nums); //we need to have duplicated numbers side by side
        backtrack(0, new ArrayList(), nums, answer);
        return answer;
    }

    private void backtrack(int start, List<Integer> subset, int[] nums, List<List<Integer>> answer){

        answer.add(new ArrayList<>(subset)); //deep copy

        for(int i = start; i < nums.length; i++){
            if(i != start && nums[i] == nums[i - 1]){ //skip duplicated numbers
                continue;
            }
            //include the number
            subset.add(nums[i]);
            backtrack(i + 1, subset, nums, answer);
            //not include the number
            subset.remove(subset.size() - 1);
        }
    }
}
