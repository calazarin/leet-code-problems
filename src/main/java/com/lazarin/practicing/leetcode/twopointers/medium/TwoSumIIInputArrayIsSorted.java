package com.lazarin.practicing.leetcode.twopointers.medium;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSumIIInputArrayIsSorted {

    //approach - two pointers
    //T: O(N)
    //S: O(1)
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] < target) l++;
            else r--;
        }
        return new int[] {l+1, r+1};
    }

}
