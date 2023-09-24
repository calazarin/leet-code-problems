package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import java.util.Arrays;

//https://leetcode.com/problems/longest-increasing-subsequence/
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int[] list = new int[nums.length];
        Arrays.fill(list, 1);

        for(int i = nums.length - 1; i >= 0; i--){

            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] < nums [j]){
                    list[i] = Math.max(list[i], 1 + list[j]);
                }
            }
        }

        return Arrays.stream(list).max().getAsInt();
    }
}
