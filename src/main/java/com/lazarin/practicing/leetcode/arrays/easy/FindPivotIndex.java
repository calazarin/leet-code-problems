package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/find-pivot-index
public class FindPivotIndex {

    public static void main(String args[]){
        FindPivotIndex solution = new FindPivotIndex();
       /* Input: nums = [1,7,3,6,5,6]
        Output: 3*/
        System.out.println(solution.pivotIndex(new int[]{1,7,3,6,5,6}));

        /*Input: nums = [1,2,3]
        Output: -1*/
        System.out.println(solution.pivotIndex(new int[]{1,2,3}));
    }

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
