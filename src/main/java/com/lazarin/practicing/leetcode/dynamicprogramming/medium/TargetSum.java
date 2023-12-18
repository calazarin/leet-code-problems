package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import java.util.Arrays;

//https://leetcode.com/problems/target-sum/description/
public class TargetSum {

    //approach 1 - brute force
    //T: O(2^n) where N is the length of nums; S: O(n)
    int count = 0;
    public int findTargetSumWays_1(int[] nums, int target) {
        calculate(nums, 0, 0, target);
        return count;
    }

    public void calculate(int[] nums, int index, int sum, int target){
        if(index == nums.length){
            if(sum == target){
                count++;
            }
        } else {
            calculate(nums, index + 1, sum + nums[index], target);
            calculate(nums, index + 1, sum - nums[index], target);
        }
    }

    //approach 2 - memoization
    //T: O(t*n) S: O(t*n) where t is the total sum of current array
    int total = 0;
    public int findTargetSumWays_2(int[] nums, int target) {
        total = Arrays.stream(nums).sum();

        int[][] memo = new int[nums.length][2 * total + 1];
        for(int[] row : memo){
            Arrays.fill(row, Integer.MIN_VALUE);
        }

        return calculate_2(nums, 0, 0, target, memo);
    }

    private int calculate_2(int[] nums, int index, int sum, int target, int[][] memo){
        if(index == nums.length){
            if(sum == target){
                return 1;
            } else {
                return 0;
            }
        } else {
            if(memo[index][sum + total] != Integer.MIN_VALUE){
                return memo[index][sum + total];
            }
            int add = calculate_2(nums, index + 1, sum + nums[index],
                    target, memo);
            int subtract = calculate_2(nums, index + 1, sum - nums[index],
                    target, memo);
            memo[index][sum + total] = add + subtract;
            return memo[index][sum + total];
        }
    }

}
