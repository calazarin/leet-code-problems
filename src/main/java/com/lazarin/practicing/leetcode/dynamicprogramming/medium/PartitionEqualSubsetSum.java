package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import java.util.Arrays;

//https://leetcode.com/problems/partition-equal-subset-sum/
public class PartitionEqualSubsetSum {

    /**
     * approach 1 - memoization
     */
    public boolean canPartition(int[] nums) {

        int totalSum = 0;
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }

        if(totalSum % 2 == 1){
            return false;
        }

        int target = totalSum / 2;

        Boolean[][] dp = new Boolean[nums.length + 1][totalSum + 1];

        return canPartition(0, nums, 0, target, dp);
    }

    private boolean canPartition(int index, int[] nums, int sum, int target, Boolean[][] dp) {
        if(dp[index][sum] != null){
            return dp[index][sum];
        }
        //base case
        if(sum == target) {
            return true;
        }

        if(sum >= target || index >= nums.length){
            return false;
        }

        dp[index][sum] = canPartition(index + 1, nums, sum, target, dp) ||
                canPartition(index + 1, nums, sum + nums[index], target, dp);

        return dp[index][sum];
    }
}
