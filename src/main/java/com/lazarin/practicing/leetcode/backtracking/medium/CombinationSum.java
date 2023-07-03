package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum/description/
public class CombinationSum {

    public static void main(String args[]){

        CombinationSum solution = new CombinationSum();

       /* Input: candidates = [2,3,6,7], target = 7
        Output: [[2,2,3],[7]]
        Explanation:
        2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
        7 is a candidate, and 7 = 7.
        These are the only two combinations.*/
        var answer = solution.combinationSum(new int[]{2,3,6,7}, 7);
        answer.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%d,", p));
            System.out.print("\n");
        });

       /* Input: candidates = [2,3,5], target = 8
        Output: [[2,2,2,2],[2,3,3],[3,5]]*/
        var answer2 = solution.combinationSum(new int[]{2,3,5}, 8);
        answer2.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%d,", p));
            System.out.print("\n");
        });

       /* Input: candidates = [2], target = 1
        Output: []*/
        var answer3 = solution.combinationSum(new int[]{2}, 1);
        answer3.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%d,", p));
            System.out.print("\n");
        });
    }

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
    //t: 2^t * k where k is the avarage length of n
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
