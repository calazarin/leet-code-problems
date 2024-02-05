package com.lazarin.practicing.leetcode.backtracking.medium;


import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/
public class Subsets {

    //T: (n * 2^n); either you pick a choicer or not
    //S: O(2^n)
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

    //T: (2^n); either you pick a choicer or not
    //S: O(2^n)
    public List<List<Integer>> subsets_2(int[] nums) {

        List<List<Integer>> answer = new ArrayList();
        solveIt(0, nums, new ArrayList<>(), answer);
        return answer;
    }


    private void solveIt(int index, int[] nums, List<Integer> subSeq, List<List<Integer>> ans) {
        if(index >= nums.length) {
            ans.add(new ArrayList(subSeq));
            return;
        }

        //take
        subSeq.add(nums[index]);
        solveIt(index  + 1, nums, subSeq, ans);

        //not take
        subSeq.remove(subSeq.size() - 1);
        solveIt(index + 1, nums, subSeq, ans);

    }
}
