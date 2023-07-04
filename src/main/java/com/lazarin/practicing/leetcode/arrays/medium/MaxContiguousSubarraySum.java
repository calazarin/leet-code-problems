package com.lazarin.practicing.leetcode.arrays.medium;

public class MaxContiguousSubarraySum {

    //O(n) time complexity
    //O(1) space complexity
    public int maxContiguousSubarraySum(int[] nums)
    {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            // Did we beat the 'maxSoFar' with the 'maxEndingHere'?
            maxSoFar = Math.max(maxSoFar, maxEndingHere);

        }
        return maxSoFar;
    }

    //brute force solution O(n^2)
    public int maxContiguousSubarraySum2(int[] nums)
    {
        var maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            var currentSum = 0;
            for(int j = i; j < nums.length; j++){
                currentSum = currentSum + nums[j];
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }

        }
        return maxSum;
    }
}
