package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllNumbersDisappearedInAnArray {

    //approach 1 -
    //T: O(N)
    //S: O(N)
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        Set<Integer> numbers = new HashSet<>();

        for(int i : nums){
            numbers.add(i);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!numbers.contains(i)){
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }

    //approach 2 - changing numbers sign to negative
    //T: O(N)
    //S: O(1)
    public List<Integer> findDisappearedNumbers2(int[] nums) {

        List<Integer> missingNumbers = new ArrayList<>();

        for(int i  = 0; i < nums.length; i++){
            int index  = Math.abs(nums[i]) - 1; //(value 1 maps to n-1)
            nums[index] = Math.abs(nums[index]) * -1;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                missingNumbers.add(i + 1);
            }
        }

        return missingNumbers;
    }
}