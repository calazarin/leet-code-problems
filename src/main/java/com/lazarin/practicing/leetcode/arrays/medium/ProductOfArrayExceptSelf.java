package com.lazarin.practicing.leetcode.arrays.medium;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelf {

    //approach 1 - suffix and prefix with extra memory
    //T: O(N)
    //S: O(N)
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] left_products = new int[n];
        int[] right_products = new int[n];

        int[] output_arr = new int[n];

        left_products[0] = 1;
        right_products[n - 1] = 1;
        for(int i = 1; i < n; i++){ //prefix
            left_products[i] = nums[i - 1] * left_products[i - 1];
        }
        for(int i = n - 2; i >= 0; i--){ //suffix
            right_products[i] = nums[i+1] * right_products[i + 1];
        }
        for(int j = 0; j < n; j++){ //multiply both
            output_arr[j] = left_products[j] * right_products[j];
        }
        return output_arr;
    }

    //approach 2 - suffix and prefix without extra memory
    //T: O(N)
    //S: (1) - output array does not count as extra space
    public int[] productExceptSelf2(int[] nums) {

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
