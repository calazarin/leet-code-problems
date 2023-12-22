package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOfTwoArrays {

    //T: O(n+m); S: O(N)
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        List<Integer> result = new ArrayList<>();

        for (int i : nums2) {
            if(set.contains(i)){
                result.add(i);
                set.remove(i);
            }
        }

        int[] ints = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ints[i]=result.get(i);
        }
        return ints;
    }

}
