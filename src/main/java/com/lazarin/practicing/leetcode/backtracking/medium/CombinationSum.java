package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum/description/
public class CombinationSum {

    //approach 1
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allAnswers = new ArrayList<>();
        dfs(0, candidates, target, 0, new ArrayList<>(), allAnswers);
        return allAnswers;
    }

    private void dfs(int index, int[] candidates, int target, int sum, List<Integer> partialAnswer, List<List<Integer>> finalAnswer){

        //bound function
        if(sum > target){
            return;
        } else if(sum == target){
            finalAnswer.add(new ArrayList<>(partialAnswer));
            return;
        }

        for(int i = index; i < candidates.length; i++){
            partialAnswer.add(candidates[i]);
            sum+=candidates[i];
            dfs(i,candidates, target, sum, partialAnswer, finalAnswer);
            partialAnswer.remove(partialAnswer.size() - 1);
            sum-=candidates[i];
        }
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
        dfs(i, candidates, target, total + candidates[i], current, finalAnswer);
        current.remove(current.size() - 1);
        //second decision: not include candidates[i]
        dfs(i + 1, candidates, target, total, current, finalAnswer);
    }
}
