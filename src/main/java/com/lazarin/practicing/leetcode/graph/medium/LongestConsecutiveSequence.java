package com.lazarin.practicing.leetcode.graph.medium;

import java.util.HashSet;

//https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        int longestSeq = 0;
        for (int num : nums) {
            numsSet.add(num);
        }
        for(int num : nums){
            if (!numsSet.contains(num - 1)) {
                int length = 0;
                while (numsSet.contains(num + length)) {
                    length += 1;
                }
                longestSeq = Math.max(length, longestSeq);
            }
        }
        return longestSeq;
    }
}
