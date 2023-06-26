package com.lazarin.practicing.leetcode.arrays.slidewindow.medium;


//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element
public class LongestSubarrayOfOnesAfterDeletingOneElement {

    public static void main(String args[]){
        LongestSubarrayOfOnesAfterDeletingOneElement solution =
                new LongestSubarrayOfOnesAfterDeletingOneElement();

       /* Input: nums = [1,1,0,1]
        Output: 3*/
        System.out.println(solution.longestSubarray2(new int[]{1,1,0,1}));

        /*Input: nums = [0,1,1,1,0,1,1,0,1]
        Output: 5*/
        System.out.println(solution.longestSubarray2(new int[]{0,1,1,1,0,1,1,0,1}));

      /*  Input: nums = [1,1,1]
        Output: 2*/
        System.out.println(solution.longestSubarray2(new int[]{1,1,1}));
    }

    //:T: O(N)
    //S: O(1)
    public int longestSubarray(int[] nums) {
        int zeroCount = 0, longestWindow = 0,start = 0;
        for(int i = 0; i < nums.length; i++){
            zeroCount += nums[i] == 0 ? 1 : 0;
            while(zeroCount > 1){
                zeroCount -= nums[start] == 0 ? 1 : 0;
                start++;
            }
            longestWindow = Math.max(longestWindow, i - start);
        }
        return longestWindow;
    }

    //:T: O(N)
    //S: O(1)
    public int longestSubarray2(int[] nums) {
        int k = 1, longestWindow = 0,j = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) {
                k--;
            }
            while(k < 0){
                if(nums[j] == 0){
                    k++;
                }
                j++;
            }
            longestWindow = Math.max(longestWindow, i - j);
        }
        return longestWindow;
    }
}
