package com.lazarin.blindlistandmore.greedy.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//https://leetcode.com/problems/largest-number/
public class LargestNumber implements Comparator<String> {

    public static void main(String args[]){

    }

    //T: O(nlogn)
    //S: O(n)
    public String largestNumber(int[] nums) {

        List<Integer> resp = new ArrayList<>();

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
        // Build largest number from sorted array.
        StringBuilder largestNumberStr = new StringBuilder();
        for(String str : strInputArr){
            largestNumberStr.append(str);
        }
        return largestNumberStr.toString();
    }

    @Override
    public int compare(String strA, String strB) {
        String orderA = strA + strB;
        String orderB = strB + strA;
        return orderB.compareTo(orderA);
    }
}
