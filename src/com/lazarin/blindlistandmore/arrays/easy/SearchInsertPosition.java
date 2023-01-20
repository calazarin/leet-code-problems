package com.lazarin.blindlistandmore.arrays.easy;

//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

    public static void main(String args[]){

        /*Input: nums = [1,3,5,6], target = 5
        Output: 2*/

      /*  Input: nums = [1,3,5,6], target = 2
        Output: 1*/

     /*   Input: nums = [1,3,5,6], target = 7
        Output: 4*/
    }

    //approach 1:
    //do a binary search for target number; if not found, return the position?
    public int searchInsert(int[] nums, int target) {

        int i = 0, j = nums.length;
        while(i <= j){

            int mid = (j + i) / 2;

            if(nums[mid] > target){
                j = mid - 1;
            } else if (nums[mid] < target){
                i = mid + 1;
            } else if (nums[mid] == target){
                return mid;
            } else {
                //not found: return suggested postion
                return mid;
            }
        }
        return -1;
    }
}
