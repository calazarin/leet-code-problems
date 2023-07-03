package com.lazarin.practicing.leetcode.backtracking.medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/subsets-ii/description/
public class Subsets2 {

    public static void main(String args[]){

        Subsets2 solution = new Subsets2();

       /* Input: nums = [1,2,2]
        Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]*/
        var resp = solution.subsetsWithDup(new int[]{1, 2, 2});
        printAnswer(resp);

      /*  Input: nums = [0]
        Output: [[],[0]]*/
        var resp2 = solution.subsetsWithDup(new int[]{0});
        printAnswer(resp2);
    }

    private static void printAnswer(List<List<Integer>> answer){
        answer.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%d,", p));
            System.out.print("\n");
        });
    }

    //T: n * 2^n; either you pick a choicer or not
    //S: O(2^n)
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer = new ArrayList();
        Arrays.sort(nums); //we need to have duplicated numbers side by side
        backtrack(0, new ArrayList(), nums, answer);
        return answer;
    }

    private void backtrack(int start, List<Integer> subset, int[] nums, List<List<Integer>> answer){

        answer.add(new ArrayList<>(subset)); //deep copy

        for(int i = start; i < nums.length; i++){
            if(i != start && nums[i] == nums[i - 1]){ //skip duplicated numbers
                continue;
            }
            //include the number
            subset.add(nums[i]);
            backtrack(i + 1, subset, nums, answer);
            //not include the number
            subset.remove(subset.size() - 1);
        }
    }
}
