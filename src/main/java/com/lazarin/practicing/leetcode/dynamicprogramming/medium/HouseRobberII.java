package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

//https://leetcode.com/problems/house-robber-ii/
public class HouseRobberII {

    //Approach - bottom up DP - T:O(N); S:O(N)
    public int rob(int[] nums) {

        if(nums.length < 2) {
            return nums[0];
        }

        int[] skipFirstHouse = new int[nums.length - 1];
        int[] skipLastHouse = new int[nums.length - 1];

        for(int i = 0; i < nums.length - 1; i++){
            skipFirstHouse[i] = nums[i + 1];
            skipLastHouse[i] = nums[i];
        }

        return Math.max(calc(skipFirstHouse), calc(skipLastHouse));
    }

    public int calc(int[] nums){
        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int take = nums[i];
            if(i > 1) {
                take += dp[i - 2];
            }
            int not_take = dp[i - 1];
            dp[i] = Math.max(take, not_take);
        }

        return dp[nums.length - 1];
    }
}
