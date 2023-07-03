package com.lazarin.practicing.leetcode.intervals.medium;

import java.util.Arrays;

//https://leetcode.com/problems/non-overlapping-intervals/
public class NonOverlappingIntervals {

    public static void main(String args[]){

       /* Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
        Output: 1
        Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.*/


     /*   Input: intervals = [[1,2],[1,2],[1,2]]
        Output: 2
        Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.*/


    /*    Input: intervals = [[1,2],[2,3]]
        Output: 0
        Explanation: You don't need to remove any of the intervals since they're already non-overlapping.*/


        //[[1,100],[11,22],[1,11],[2,12]]
        //Output: 2
        System.out.println(eraseOverlapIntervals(new int[][]{ {1,100}, {11,22}, {1,11}, {2,12}}));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {

        int resp = 0;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); //O (log n)

        int[] prevInterval = null;
        for(int[] interval : intervals){ //O (N)
            if(prevInterval == null){
                prevInterval = interval;
            } else {
                if(interval[0] < prevInterval[1]){
                    resp++;
                } else {
                    prevInterval = interval;
                }
            }
        }
        return resp;
    }

    public static int eraseOverlapIntervals2(int[][] intervals) {

        int resp = 0;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        //[1,100],
        // 1,11
        //2,12
        //11,22

        int prevEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            var interval = intervals[i];
            if(interval[0] >= prevEnd) {// it's coming after, we are ok
                prevEnd = interval[1];
            } else {
                resp++;
                prevEnd = Math.min(prevEnd, interval[1]);
            }
        }

        return resp;
    }
}


