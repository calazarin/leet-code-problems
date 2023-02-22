package com.lazarin.practicing.leetcode.arrays.medium;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelf {
    
    public static void main(String args[]){
        /*Input: nums = [1,2,3,4]
        Output: [24,12,8,6]*/
        var resp = productExceptSelf(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(resp));

      /*  Input: nums = [-1,1,0,-3,3]
        Output: [0,0,9,0,0]*/
        var resp2 = productExceptSelf(new int[]{-1,1,0,-3,3});
        System.out.println(Arrays.toString(resp2));
    }

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] left_products = new int[n];
        int[] right_products = new int[n];

        int[] output_arr = new int[n];

        left_products[0] = 1;
        right_products[n - 1] = 1;
        for(int i = 1; i < n; i++){
            left_products[i] = nums[i - 1] * left_products[i - 1];
        }
        for(int i = n - 2; i >= 0; i--){
            right_products[i] = nums[i+1] * right_products[i + 1];
        }
        for(int j = 0; j < n; j++){
            output_arr[j] = left_products[j] * right_products[j];
        }
        return output_arr;
    }

    public static int[] productExceptSelf2(int[] nums) {

        int n = nums.length;

        int[] output_arr = new int[n];

        output_arr[0] = 1;

        for(int i = 1; i < n; i++){
            output_arr[i] = nums[i - 1] * output_arr[i - 1];
        }

        int result = 1;
        for(int j = n -1; j >= 0; j--){
            output_arr[j] = output_arr[j] * result;
            result = result * nums[j];
        }
        return output_arr;
    }

}
