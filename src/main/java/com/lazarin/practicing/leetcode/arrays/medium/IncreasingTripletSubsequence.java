package com.lazarin.practicing.leetcode.arrays.medium;

//https://leetcode.com/problems/increasing-triplet-subsequence/
public class IncreasingTripletSubsequence {

    public static void main(String args[]){

        IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();

        /*Input: nums = [1,2,3,4,5]
        Output: true
        Explanation: Any triplet where i < j < k is valid.*/
        System.out.println(solution.increasingTriplet2(new int[]{1,2,3,4,5}));

      /*  Input: nums = [5,4,3,2,1]
        Output: false
        Explanation: No triplet exists.*/
        System.out.println(solution.increasingTriplet2(new int[]{5,4,3,2,1}));

      /*  Input: nums = [2,1,5,0,4,6]
        Output: true
        Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.*/
        System.out.println(solution.increasingTriplet(new int[]{2,1,5,0,4,6}));
    }

    //approach 1 - brute force
    //T: O (n^3)
    public boolean increasingTriplet(int[] nums) {

        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i] < nums[j] && nums[j] < nums[k]){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    //approach 2 - optimal without extra space and O(n)
    public boolean increasingTriplet2(int[] nums) {
        if(nums.length < 3) {
            return false;
        }

        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        for(int curr = 0; curr < nums.length; curr++){
            if(nums[curr] <= i){
                i = nums[curr];
            } else if(nums[curr] <= j){
                j = nums[curr];
            } else {
                return true;
            }
        }

        return false;
    }
}