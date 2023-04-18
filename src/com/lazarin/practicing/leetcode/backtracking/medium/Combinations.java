package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combinations/
public class Combinations {

    public static void main(String args[]){

        Combinations solution = new Combinations();

        /*Input: n = 4, k = 2
        Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
        Explanation: There are 4 choose 2 = 6 total combinations.
        Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.*/
        var resp = solution.combine(4, 2);
        resp.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%d,", p));
            System.out.print("\n");
        });

       /* Input: n = 1, k = 1
        Output: [[1]]
        Explanation: There is 1 choose 1 = 1 total combination.*/
        var resp2 = solution.combine(1, 1);
        resp2.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%d,", p));
            System.out.print("\n");
        });
    }

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

        for(int i = start; i <= n; i++){ //decision spac
            combination.add(i);
            dfs(i + 1, k, n, combination, finalAnswer);
            combination.remove(combination.size() - 1);
        }
    }

}
