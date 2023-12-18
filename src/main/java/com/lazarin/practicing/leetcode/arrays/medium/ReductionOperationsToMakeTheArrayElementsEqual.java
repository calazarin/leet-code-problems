package com.lazarin.practicing.leetcode.arrays.medium;

import java.util.Arrays;

//https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal
public class ReductionOperationsToMakeTheArrayElementsEqual {

      //approach - sorting first - then compare number -: T: (nlogn); O: (logn)
    public int reductionOperations_2(int[] nums) {
        Arrays.sort(nums);
        int answer = 0;
        int count = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] != nums[i + 1]){
                answer += count;
            }
            count++;
        }
        return answer;
    }
}
