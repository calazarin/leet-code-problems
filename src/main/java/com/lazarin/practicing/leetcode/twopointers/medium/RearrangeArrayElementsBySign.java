package com.lazarin.practicing.leetcode.twopointers.medium;

//https://leetcode.com/problems/rearrange-array-elements-by-sign/
public class RearrangeArrayElementsBySign {

    //approach 1 - two auxiliary arrays
    //T: O(N); S:O(N)
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];

        int p = 0; int n = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                neg[n++] = nums[i];
            } else {
                pos[p++] = nums[i];
            }
        }
        p = 0;
        n = 0;
        for(int j = 0; j < nums.length; j++) {
            if(j % 2 == 0) {
                nums[j] = pos[p++];
            } else {
                nums[j] = neg[n++];
            }
        }
        return nums;
    }

    //approach 2 - optimal solution
    public int[] rearrangeArray_2(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0, neg = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }

        return ans;
    }
}
