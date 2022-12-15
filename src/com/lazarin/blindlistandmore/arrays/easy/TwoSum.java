package com.lazarin.blindlistandmore.arrays.easy;

import java.util.Arrays;

public class TwoSum {

    //https://leetcode.com/problems/two-sum/
    public static void main(String args[]){

        int[] input1 = new int[]{2, 7, 11, 15};
        var target1 = 9;
        var resp1 = twoSum(input1, target1);
        System.out.println(Arrays.toString(resp1));

        int[] input2 = new int[]{3, 2, 4};
        var target2 = 6;
        var resp2 = twoSum(input2, target2);
        System.out.println(Arrays.toString(resp2));

        int[] input3 = new int[]{3, 3};
        var target3 = 6;
        var resp3 = twoSum(input3, target3);
        System.out.println(Arrays.toString(resp3));
    }

    //T: O(n^2)
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            var firstNum = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(firstNum + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

}
