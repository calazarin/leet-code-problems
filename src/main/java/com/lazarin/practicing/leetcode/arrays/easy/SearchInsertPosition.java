package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int i = 0, j = nums.length - 1;

        while(i <= j){

            int mid = (j + i) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(target > nums[mid]){
                i = mid + 1;
            } else {
                j = mid - 1;
            }

        }
        return i;
    }
}
