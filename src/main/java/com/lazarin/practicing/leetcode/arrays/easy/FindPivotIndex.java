package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/find-pivot-index
public class FindPivotIndex {

    //T: O(N)
    //S: O(1)
    public int pivotIndex(int[] nums) {

        int leftSum = 0, totalSum = 0;
        for(int n : nums){
            totalSum += n;
        }
        for(int i = 0; i < nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
