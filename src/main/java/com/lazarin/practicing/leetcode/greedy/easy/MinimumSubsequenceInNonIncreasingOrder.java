package com.lazarin.practicing.leetcode.greedy.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/description/
public class MinimumSubsequenceInNonIncreasingOrder {

    //approach - greedy sorting the array and comparing elements
    public List<Integer> minSubsequence(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0, currSum = 0;

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){ //sum all elements
            sum += nums[i];
        }

        for(int j = n - 1; j >=0; j--) {
            currSum += nums[j];
            sum -= nums[j];
            ans.add(nums[j]);
            if(currSum > sum) {
                break;
            }
        }

        return ans;
    }

    //approach 2 - greedy sorting the array and comparing elements starting from the greatest one
    public List<Integer> minSubsequence_2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int allElemtSum = 0, resultSum = 0;

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){ //sum all elements
            allElemtSum += nums[i];
        }
        int index = n - 1;
        while(resultSum <= allElemtSum - resultSum){
            ans.add(nums[index]);
            resultSum += nums[index];
            index--;
        }

        return ans;
    }
}
