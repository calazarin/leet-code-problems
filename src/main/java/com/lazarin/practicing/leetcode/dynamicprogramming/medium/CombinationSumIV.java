package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import java.util.HashMap;

//https://leetcode.com/problems/combination-sum-iv/
public class CombinationSumIV {

    //approach 1
   public int combinationSum4(int[] nums, int target) {

        if(target == 0) return 1;
        if(target < 0) return 0;

        var result = 0;
        for(Integer number : nums){

            var newTarget = target - number;
            result += combinationSum4(nums, newTarget);

        }

        return result;
    }

    //approach 2
    public int combinationSum4_2(int[] nums, int target) {
        return combSum(nums, target, new HashMap<>());
    }

    private int combSum(int[] nums, int target, HashMap<Integer, Integer> memo){
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
    }

   //approach 3 - Top-down
   public int combinationSum4_3(int[] nums, int target) {

        if(target == 0) return 1;

        int res = 0;
        for(Integer n: nums) {
            if(n <= target) {
                res += combinationSum4_3(nums, target - n);
            }
        }
        return res;
    }

    //approach 4 - bottom up => O(n*m)
    public int combinationSum4_4(int[] nums, int target) {
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
