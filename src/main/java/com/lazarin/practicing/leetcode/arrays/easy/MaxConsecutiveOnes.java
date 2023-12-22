package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/max-consecutive-ones
public class MaxConsecutiveOnes {

    //approach 1 - brute force
    //T: O(N); S: O(1)
    public int findMaxConsecutiveOnes(int[] nums) {

        int currentCounter = 0, maxCounter = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currentCounter++;
            } else {
                currentCounter = 0;
            }
            maxCounter = Math.max(currentCounter, maxCounter);
        }

        return maxCounter;
    }
}
