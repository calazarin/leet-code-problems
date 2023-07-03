package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/move-zeroes
public class MoveZeroes {

    public static void main(String args[]){
        //input:  [0 - 0]
        MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(new int[]{0, 0});

        /*input: [1,0]
        output: [1,0]*/
        solution.moveZeroes(new int[]{1, 0});

       /* Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]*/
        solution.moveZeroes(new int[]{0,1,0,3,12});

       /* Input: nums = [0]
        Output: [0]*/
        solution.moveZeroes(new int[]{0});
    }

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
