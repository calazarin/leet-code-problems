package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum-ii/description/
public class CombinationSum2 {

    public static void main(String args[]){

        CombinationSum2 cb = new CombinationSum2();

        /*Input: candidates = [10,1,2,7,6,1,5], target = 8
        Output:
            [
            [1,1,6],
            [1,2,5],
            [1,7],
            [2,6]
            ]*/
        var resp = cb.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        resp.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%d,", p));
            System.out.print("\n");
        });

        System.out.print("\n\n");

        /*Input: candidates = [2,5,2,1,2], target = 5
        Output:
            [
            [1,2,2],
            [5]
            ]*/
        var resp2 = cb.combinationSum2(new int[]{2,5,2,1,2}, 5);
        resp2.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%d,", p));
            System.out.print("\n");
        });
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(candidates);
        dfs(0, new ArrayList<>(), candidates, target, ans);
        return ans;

    }

    public void dfs(int currIndex, List<Integer> comb, int[] candidates, int target, List<List<Integer>> ans){

        if(target == 0){
            ans.add(new ArrayList<>(comb));
            return;
        }

        for(int i = currIndex; i < candidates.length; i++){

            if(i > currIndex && candidates[i] == candidates[i - 1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            comb.add(candidates[i]);
            dfs(i + 1, comb, candidates, target - candidates[i], ans);
            comb.remove(comb.size() - 1);
        }
    }
}
