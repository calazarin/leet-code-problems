package com.lazarin.practicing.leetcode.arrays.medium;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int targetIndex = -1;

        if(nums == null || nums.length == 0){
            return targetIndex;
        }

        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while(leftPointer <= rightPointer){

            if(nums[leftPointer] == target){
                return leftPointer;
            }

            if(nums[rightPointer] == target){
                return rightPointer;
            }

            if(nums[rightPointer] > target){
                rightPointer--;
            }else if(nums[leftPointer] < target){
                leftPointer++;
            } else {
                return -1;
            }

        }

        return targetIndex;
    }

}
