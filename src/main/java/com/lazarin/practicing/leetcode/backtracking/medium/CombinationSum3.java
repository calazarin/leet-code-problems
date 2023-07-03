package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum-iii/
public class CombinationSum3 {

    public static void main(String args[]){

        CombinationSum3 solution = new CombinationSum3();

       /* Input: k = 3, n = 7
        Output: [[1,2,4]]
        Explanation:
        1 + 2 + 4 = 7
        There are no other valid combinations.*/
        var resp = solution.combinationSum3(3, 7);
        printAnswer(resp);

      /*  Input: k = 3, n = 9
        Output: [[1,2,6],[1,3,5],[2,3,4]]
        Explanation:
        1 + 2 + 6 = 9
        1 + 3 + 5 = 9
        2 + 3 + 4 = 9
        There are no other valid combinations.*/
        var resp2 = solution.combinationSum3(3, 9);
        printAnswer(resp2);

        /*Input: k = 4, n = 1
        Output: []
        Explanation: There are no valid combinations.
        Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10
        and since 10 > 1, there are no valid combination.*/
        var resp3 = solution.combinationSum3(4, 1);
        printAnswer(resp3);

    }

    private static void printAnswer(List<List<Integer>> answer){
        answer.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%d,", p));
            System.out.print("\n");
        });
    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> resp = new ArrayList<>();

        return resp;
    }
}
