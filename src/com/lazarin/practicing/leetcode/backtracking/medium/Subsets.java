package com.lazarin.practicing.leetcode.backtracking.medium;


import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/
public class Subsets {

    public static void main(String args[]){

        Subsets solution = new Subsets();

       /* Input: nums = [1,2,3]
        Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]*/
        var resp = solution.subsets(new int[]{1, 2, 3});
        printAnswer(resp);

      /*  Input: nums = [0]
        Output: [[],[0]]*/
        var resp2 = solution.subsets(new int[]{0});
        printAnswer(resp2);
    }

    private static void printAnswer(List<List<Integer>> answer){
        answer.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%d,", p));
            System.out.print("\n");
        });
    }

    //T: n * 2^n; either you pick a choicer or not
    //S: O(n)
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

}
