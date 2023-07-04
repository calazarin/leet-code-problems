package com.lazarin.practicing.leetcode.arrays.medium;

//LeetCode 153
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {

        var res = nums[0];
        int left = 0 , right = nums.length - 1;
        while(left <= right) {
            if(nums[left] < nums[right]){ //if the array is sorted
                res = Math.min(res, nums[left]);
                break;
            }
            var mid = (left + right) / 2;
            res = Math.min(res, nums[mid]);

            //binary search part
            if(nums[mid] >= nums[left]){ //look into right portion
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    private int findMinAux2(int[] nums, int leftIndex, int rightIndex){

        int minLeftSide = 0, minRightSide = 0;
        while(leftIndex <= rightIndex ){
            int middlePoint = (rightIndex + leftIndex) / 2;
         //   minLeftSide = findMinAux(nums, leftIndex, middlePoint - 1);
            minRightSide = findMinAux2(nums, middlePoint, nums.length - 1);

        }

        if(minLeftSide < minRightSide) {
            return minLeftSide;
        } else {
            return minRightSide;
        }
    }

    //Brute force
    //O(n) time complexity
    //O(1) space complexity
    public int findMin2(int[] nums) {
        var min = Integer.MAX_VALUE;
        for(Integer n : nums){
            if (n < min) min =n;
        }
        return min;
    }
}
