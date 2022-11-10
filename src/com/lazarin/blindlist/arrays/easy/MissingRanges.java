package com.lazarin.blindlist.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/missing-ranges/
public class MissingRanges {

    public static void main(String args[]){

        /*Input: nums = [0,1,3,50,75], lower = 0, upper = 99
        Output: ["2","4->49","51->74","76->99"]
        Explanation: The ranges are:
        [2,2] --> "2"
        [4,49] --> "4->49"
        [51,74] --> "51->74"
        [76,99] --> "76->99"*/

      /*  Input: nums = [-1], lower = -1, upper = -1
        Output: []
        Explanation: There are no missing ranges since there are no missing numbers.*/
    }

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
