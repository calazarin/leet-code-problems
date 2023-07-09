package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {

    //Time - O(n); Space O(n)
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> numberSet = new HashSet<>();
        for(int n : nums) {
            var added = numberSet.add(n);
            if(!added){
                return true;
            }
        }
        return false;
    }
}
