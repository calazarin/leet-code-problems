package com.lazarin.practicing.leetcode.arrays.medium;

//https://leetcode.com/problems/increasing-triplet-subsequence/
public class IncreasingTripletSubsequence {


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