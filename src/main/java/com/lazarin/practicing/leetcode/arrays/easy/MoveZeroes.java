package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/move-zeroes
public class MoveZeroes {

    //T: O(N)
    //S: (1)
    public void moveZeroes(int[] nums) {
        int nonZerosIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[nonZerosIndex] = nums[i];
                nonZerosIndex++;
            }
        }

        for(int i = nonZerosIndex; i < nums.length; i++){
            nums[i] = 0;
        }
    }

}
