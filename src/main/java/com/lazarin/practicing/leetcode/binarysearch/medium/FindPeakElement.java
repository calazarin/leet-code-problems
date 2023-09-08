package com.lazarin.practicing.leetcode.binarysearch.medium;

//https://leetcode.com/problems/find-peak-element/description/
public class FindPeakElement {

    /**
     * Peak can exist in three ways:
     * - descending order
     * - ascending order
     * - somewhere in the middle
     */
    //approach 1
    //T: O(N)
    //S: O(1)
    public int findPeakElement(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }

        return nums.length - 1;
    }

    //approach 2 - recursive binary search (modified)
    //T: O(logN)
    //O: O(logN)
    public int findPeakElement2(int[] nums) {
        return search(nums, 0, nums.length - 1);
    }

    private int search(int[] nums, int left, int right){
        if(left == right){ //n/2 is the peek; base case
            return left;
        }
        int mid = (left + right) / 2;
        if(nums[mid] > nums[mid + 1]){
            return search(nums, left, mid); //go to left
        }
        return search(nums, mid + 1, right); //go to right
    }

    public int findPeakElement3(int[] nums){
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] > nums[mid + 1]){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}