package com.lazarin.practicing.leetcode.binarysearch.easy;

//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class MaximumCountOfPositiveIntegerAndNegativeInteger {

    //approach 1
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0) {
                neg++;
            }
            if(nums[i] > 0) {
                pos++;
            }
        }
        return Math.max(pos,neg);
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int idx = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target) {
                left = mid + 1;
                idx = mid;
            } else {
                right = mid - 1;
            }
        }
        return idx;
    }

    //approach 2 - more optimal with binary search - T: O(logN)
    public int maximumCount_2(int[] nums) {
        int posNegOne = binarySearch(nums, -1);
        int posZero = binarySearch(nums, 0);
        return Math.max(posNegOne + 1, nums.length - posZero - 1);
    }
}
