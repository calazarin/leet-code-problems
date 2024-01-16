package com.lazarin.practicing.leetcode.slidingwindow.easy;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
public class MinimumDifferenceBetweenHighestAndLowestOfKScores {

    //T: O (n * logn)
    //S: O(1)
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);

        int i = 0, j = k - 1,
                min = Integer.MAX_VALUE;

        while (j < nums.length) {
            min = Math.min(min, nums[j++] - nums[i++]);
        }

        return min;
    }
}
