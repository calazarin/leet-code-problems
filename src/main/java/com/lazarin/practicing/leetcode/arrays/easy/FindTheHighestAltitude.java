package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/find-the-highest-altitude
public class FindTheHighestAltitude {

    //T: O(N)
    //S: O(1)
    public int largestAltitude(int[] gain) {
        int sum = 0, highest = sum;

        for(int i = 0; i < gain.length; i++){
            sum = sum + gain[i];
            highest = Math.max(sum, highest);
        }

        return highest;
    }
}
