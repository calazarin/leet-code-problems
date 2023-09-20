package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combinations/
public class Combinations {

    //approach 1 - brute force with backtracking
    //T: K * n ^k
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> answer = new ArrayList<>();
        dfs(1, k, n, new ArrayList<>(), answer);
        return answer;
    }

    public void dfs(int start, int k, int n, List<Integer> combination, List<List<Integer>> finalAnswer){
        if(combination.size() == k){
            finalAnswer.add(new ArrayList<>(combination));
            return;
        }

        for(int i = start; i <= n; i++){ //decision space
            combination.add(i);
            dfs(i + 1, k, n, combination, finalAnswer);
            combination.remove(combination.size() - 1);
        }
    }

}
