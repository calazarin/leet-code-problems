package com.lazarin.practicing.leetcode.arrays.easy;


//https://leetcode.com/problems/range-sum-query-immutable/
public class RangeSumQueryImmutable {

    public class NumArray{

        int[] sums;

        public NumArray(int[] nums) {
            //first sum up inputs
            sums = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                sums[i + 1] = sums[i] + nums[i];
            }
        }

        //best approach to sum range = cumulative sum
        //T: O(1)
        public int sumRange(int i, int j) {
            var a = sums[j + 1];
            var b = sums[i];
            return b - a;
        }
    }
}
