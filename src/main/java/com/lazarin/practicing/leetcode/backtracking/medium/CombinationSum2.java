package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum-ii/description/
public class CombinationSum2 {

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
