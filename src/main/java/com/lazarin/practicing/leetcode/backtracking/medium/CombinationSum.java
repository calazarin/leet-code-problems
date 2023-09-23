package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum/description/
public class CombinationSum {

    //approach 1
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allAnswers = new ArrayList<>();
        findCombinations(0, candidates, target, new ArrayList<>(), allAnswers);
        return allAnswers;
    }

    private void findCombinations(int index, int[] candidates, int target, List<Integer> partialAnswer, List<List<Integer>> finalAnswer){

        //bound function
        if(index == candidates.length){
            if(target == 0){
                finalAnswer.add(new ArrayList<>(partialAnswer));
            }
            return;
        }

        //include candidates[i]
        if(candidates[index] <= target) {
            partialAnswer.add(candidates[index]);
            findCombinations(index, candidates, target - candidates[index], partialAnswer, finalAnswer);
            partialAnswer.remove(partialAnswer.size() - 1);
        }

        //not include candidates[i]
        findCombinations(index + 1, candidates, target, partialAnswer, finalAnswer);
    }

    //approach 2
    //t: 2^t * k where k is the average length of n
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> allAnswers = new ArrayList<>();
        dfs2(0, candidates, target, 0, new ArrayList<>(), allAnswers);
        return allAnswers;
    }

    private void dfs2(int i, int[] candidates, int target, int total, List<Integer> current,
                      List<List<Integer>> finalAnswer){

        if(total == target){
            finalAnswer.add(new ArrayList<>(current));
            return;
        }

        if(i >= candidates.length || total > target){
            return;
        }

        current.add(candidates[i]);
        //first decision: include candidates[i]
        dfs2(i, candidates, target, total + candidates[i], current, finalAnswer);
        current.remove(current.size() - 1);
        //second decision: not include candidates[i]
        dfs2(i + 1, candidates, target, total, current, finalAnswer);
    }
}
