package com.lazarin.practicing.leetcode.graph.medium;

import java.util.HashSet;

//https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {

    public static void main(String args[]){

       /* Input: nums = [100,4,200,1,3,2]
        Output: 4
        Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.*/
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));

        /*Input: nums = [0,3,7,2,5,8,4,6,0,1]
        Output: 9*/
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));

    }

    public static int longestConsecutive(int[] nums) {
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
