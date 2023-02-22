package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import java.util.HashMap;

public class CombinationSumIV {

    //https://leetcode.com/problems/combination-sum-iv/
    public static void main(String args[]){

      /*  Input: nums = [1,2,3], target = 4
        Output: 7*/
        System.out.println(combinationSum4(new int[]{1,2,3}, 4));

        /*Input: nums = [9], target = 3
        Output: 0*/
       // System.out.println(combinationSum4(new int[]{9}, 3));

         /*Input: nums = [4,2,1], target = 32
        Output: 39882198*/
       // System.out.println(combinationSum4(new int[]{4,2,1}, 32));

    }

   /* public static int combinationSum4(int[] nums, int target) {

        if(target == 0) return 1;
        if(target < 0) return 0;

        var result = 0;
        for(Integer number : nums){

            var newTarget = target - number;
            result += combinationSum4(nums, newTarget);

        }

        return result;
    }*/

   /* public static int combinationSum4(int[] nums, int target) {
        return combSum(nums, target, new HashMap<>());
    }

    private static int combSum(int[] nums, int target, HashMap<Integer, Integer> memo){
        if(memo.get(target) != null) {
            return memo.get(target);
        }
        if(target == 0) return 1;
        if(target < 0) return 0;

        var result = 0;
        for(Integer number : nums){

            var newTarget = target - number;
            result += combinationSum4(nums, newTarget);

        }
        memo.put(target, result);
        return result;
    }*/

    //Top-down
   /* public static int combinationSum4(int[] nums, int target) {

        if(target == 0) return 1;

        int res = 0;
        for(Integer n: nums) {
            if(n <= target) {
                res += combinationSum4(nums, target - n);
            }
        }
        return res;
    }*/

    //bottom up => O(n*m)
    public static int combinationSum4(int[] nums, int target) {
        HashMap<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 1);
        for(int total = 1; total < target + 1; total++){
            dp.put(total, 0);
            for(int n  : nums){
                var storedValue = dp.get(total - n);
                dp.put(total, dp.get(total) + (storedValue != null ? storedValue : 0));
            }
        }
        return dp.get(target);
    }
}
