package com.lazarin.blindlistandmore.dynamicprogramming.medium;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    //300. https://leetcode.com/problems/longest-increasing-subsequence/
    public static void main(String args[]){

      /*  Input: nums = [10,9,2,5,3,7,101,18]
        Output: 4
        Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.*
       */
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));

  /*    Input: nums = [0,1,0,3,2,3]
        Output: 4*/
        System.out.println(lengthOfLIS(new int[]{0,1,0,3,2,3}));

        /*Input: nums = [7,7,7,7,7,7,7]
        Output: 1*/
        System.out.println(lengthOfLIS(new int[]{7,7,7,7,7,7,7}));

    }

    public static int lengthOfLIS(int[] nums) {
        int[] list = new int[nums.length];
        Arrays.fill(list, 1);

        for(int i = nums.length - 1; i >= 0; i--){

            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] < nums [j]){
                    list[i] = Math.max(list[i], 1 + list[j]);
                }
            }
        }

        return Arrays.stream(list).max().getAsInt();
    }
}
