package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/missing-ranges/
public class MissingRanges {

    //T: O(N) where N is the amount of element in the nums array
    //S: O(1) as the output does not count
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {

        List<String> result = new ArrayList<>();
        int prev = lower - 1;
        for(int i = 0; i <= nums.length; i++){
            int cur = (i < nums.length) ? nums[i] : upper + 1;
            if(prev + 1 <= cur - 1){
                result.add(formatRange(prev + 1, cur -1));
            }
            prev = cur;
        }

        return result;
    }

    private String formatRange(int lower, int upper){
        if(lower == upper){
            return String.valueOf(lower);
        }
        return lower + "->" + upper;
    }
}
