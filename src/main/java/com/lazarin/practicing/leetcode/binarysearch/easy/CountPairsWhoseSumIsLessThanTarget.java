package com.lazarin.practicing.leetcode.binarysearch.easy;

import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
public class CountPairsWhoseSumIsLessThanTarget {

    //approach 1 - brute force
    public int countPairs(List<Integer> nums, int target) {
        int count  = 0;
        for(int i = 0; i < nums.size(); i++){
            for(int j = i + 1; j < nums.size(); j++) {
                if(nums.get(i) + nums.get(j) < target){
                    count += 1;
                }
            }
        }

        return count;
    }

    //approach 2 - optimized with 2 pointers
    //T: O(nlogn) - S:O(1)
    public int countPairs_2(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left = 0, right = nums.size() - 1, count = 0;

        while(left < right){
            if(nums.get(left) + nums.get(right) < target){
                count += right - left;
                left++;
            } else {
                right --;
            }
        }

        return count;
    }
}
