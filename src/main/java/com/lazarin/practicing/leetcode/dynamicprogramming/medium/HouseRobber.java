package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

//https://leetcode.com/problems/house-robber/
public class HouseRobber {

    //T:O(N); S:O(N)
    public int rob(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < dp.length; i++){
            //take current house and house at i - 2 or take the previous house
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length-1];
    }

}
