package com.lazarin.practicing.leetcode.arrays.medium;

//https://leetcode.com/problems/number-of-zero-filled-subarrays/
public class NumberOfZeroFilledSubarrays {

    //T: O(n)
    //S: (1)
    public long zeroFilledSubarray(int[] nums) {

        int pointer = 0;
        long result = 0;

        while(pointer < nums.length){
            int counter = 0;

            while(pointer < nums.length && nums[pointer] == 0){
                counter++;
                pointer++;
                result+=counter;
            }

            pointer++;
        }

        return result;
    }

    //other way of coding it
    // T: O(n)
    //S: (1)
    public long zeroFilledSubarray2(int[] nums) {

        long result = 0;
        int counter = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){
                counter++;
            } else {
                counter = 0;
            }
            result += counter;
        }
        return result;
    }
}