package com.lazarin.practicing.leetcode.arrays.medium;

public class MaximumProductSubarray {

    //https://leetcode.com/problems/maximum-product-subarray/
    public static void main(String args[]){

        /*Input: nums = [2,3,-2,4]
        Output: 6
        Explanation: [2,3] has the largest product 6.*/
        System.out.println(maxProduct(new int[]{2,3,-2,4}));

      /*  Input: nums = [-2,0,-1]
        Output: 0
        Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/
        System.out.println(maxProduct(new int[]{-2,0,-1}));
    }

    //O(n) time complexity
    //O(1) space complexity
    public static int maxProduct(int[] nums) {

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

    private static int min(int a, int b, int c) {
        if( a <= b && a <= c){
            return a;
        } else if(b <= a && b <= c){
            return b;
        } else{
            return c;
        }
    }

    private static int max(int a, int b, int c) {
        if(a >= b && a >= c){
            return a;
        } else if(b >= a && b >= c){
            return b;
        } else {
            return c;
        }
    }

}