package com.lazarin.practicing.leetcode.intervals.medium;

import java.util.Arrays;

//https://leetcode.com/problems/non-overlapping-intervals/
public class NonOverlappingIntervals {

    /**
     * approach 1 - sorting and greedy
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        int resp = 0;
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        int prevEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            var interval = intervals[i];
            if(interval[0] >= prevEnd) {// it's coming after, we are ok
                prevEnd = interval[1]; //update end
            } else {
                resp++;
                prevEnd = Math.min(prevEnd, interval[1]);
            }
        }

        return resp;
    }
}


