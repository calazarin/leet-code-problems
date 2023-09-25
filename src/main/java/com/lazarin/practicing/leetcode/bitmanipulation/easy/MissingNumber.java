package com.lazarin.practicing.leetcode.bitmanipulation.easy;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {

    public int missingNumber(int[] nums) {

        int[] check = new int[nums.length + 1];

        //n == nums.length
        for(int i = 0;  i < nums.length; i++){
            var number = nums[i];
            check[number] = 1;
        }
        for(int j = 0; j < check.length; j++){
            if(check[j] == 0) {
                return j;
            }
        }
        return 0;
    }

    public int missingNumber2(int[] nums) {

        Arrays.sort(nums);
        for(int i = 0; i <= nums.length; i++){
            if(nums[i] != i) return i;
        }
        return 0;
    }

}
