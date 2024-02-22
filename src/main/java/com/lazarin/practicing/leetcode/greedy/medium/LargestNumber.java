package com.lazarin.practicing.leetcode.greedy.medium;

import java.util.Arrays;

//https://leetcode.com/problems/largest-number/
public class LargestNumber {

    //T: O(nlogn)
    //S: O(n)
    public String largestNumber(int[] nums) {

        // Get input integers as strings.
        String[] strInputArr = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strInputArr[i] = String.valueOf(nums[i]);
        }

        // Sort strings according to custom comparator.
        Arrays.sort(strInputArr, (a, b) -> {
            String orderA = a + b;
            String orderB = b + a;
            return orderB.compareTo(orderA);
        });

        // If, after being sorted, the largest number is `0`, the entire number
        // is zero.
        if (strInputArr[0].equals("0")) {
            return "0";
        }
        // Build the largest number from sorted array.
        StringBuilder largestNumberStr = new StringBuilder();
        for(String str : strInputArr){
            largestNumberStr.append(str);
        }
        return largestNumberStr.toString();
    }
}
