package com.lazarin.practicing.leetcode.arrays.medium;

//https://leetcode.com/problems/maximum-product-subarray/
public class MaximumProductSubarray {

    //O(n) time complexity
    //O(1) space complexity
    public int maxProduct(int[] nums) {

        int res = nums[0];
        int curMax = 1, curMin = 1;

        for(int i =0; i < nums.length; i++){
            var temp = curMax * nums[i];
            curMax = max(nums[i] * curMax, nums[i] * curMin, nums[i]);
            curMin = min(temp, nums[i] * curMin, nums[i]);
            res = max(res, curMax, curMin);
        }

        return res;
    }

    private int min(int a, int b, int c) {
        if( a <= b && a <= c){
            return a;
        } else if(b <= a && b <= c){
            return b;
        } else{
            return c;
        }
    }

    private int max(int a, int b, int c) {
        if(a >= b && a >= c){
            return a;
        } else if(b >= a && b >= c){
            return b;
        } else {
            return c;
        }
    }

}