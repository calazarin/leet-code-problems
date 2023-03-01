package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllNumbersDisappearedInAnArray {

    public static void main(String args[]){

        FindAllNumbersDisappearedInAnArray fnda = new FindAllNumbersDisappearedInAnArray();

      /*  Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]*/
        List<Integer> resp = fnda.findDisappearedNumbers2(new int[]{4,3,2,7,8,2,3,1});
        resp.forEach(System.out::println);

        System.out.print("\n\n\n");

      /*  Input: nums = [1,1]
        Output: [2]*/
        List<Integer> resp2 = fnda.findDisappearedNumbers(new int[]{1,1});
        resp.forEach(System.out::println);
    }

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