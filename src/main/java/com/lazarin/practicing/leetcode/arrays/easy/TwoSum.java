package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.HashMap;

//https://leetcode.com/problems/two-sum/
public class TwoSum {

    //T: O(n^2)
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            var firstNum = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(firstNum + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    //approach 2 - optimized
    public int[] twoSum2(int[] nums, int target) {

        //value;index
        HashMap<Integer, Integer> valueMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            var diff = target - nums[i];
            if(valueMap.containsKey(diff)){
                return new int[]{ i, valueMap.get(diff)};
            }
            valueMap.put(nums[i],i);
        }

        return new int[]{};
    }

}
