package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum-iii/
public class CombinationSum3 {

    //approach 1 - backtracking exhausting all possibilities
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> answers = new ArrayList<>();
        backtracking(1, k, new ArrayList<Integer>(), answers, n);
        return answers;

    }

    private void backtracking(int fromNumber, int k, List<Integer> combination, List<List<Integer>> answers, int requiredSum){

        if(combination.size() == k && requiredSum == 0) {
            answers.add(new ArrayList(combination)); //copy the output list before adding it in the final result
            return;
        }

        for(int i = fromNumber; i <=9; i++) {
            combination.add(i);
            backtracking(i + 1, k, combination, answers, requiredSum - i);
            combination.remove(combination.size() - 1);
        }

    }
}
