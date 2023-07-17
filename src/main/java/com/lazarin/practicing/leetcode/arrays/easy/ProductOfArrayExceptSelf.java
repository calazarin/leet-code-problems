package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] output_arr = new int[n];

        output_arr[0] = 1;

        for(int i = 1; i < n; i++){ //compute prefix
            output_arr[i] = nums[i - 1] * output_arr[i - 1];
        }

        int right = 1;
        for(int j = n - 1; j >= 0; j--){ //compute suffix
            output_arr[j] = output_arr[j] * right;
            right = right * nums[j];
        }
        return output_arr;
    }

}