package com.lazarin.practicing.leetcode.intervals.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {

    /**
     * approach 1 - optimal - sorting provided input -
     * T: O(nlogn)
     * S: O(n)
     */
    public int[][] merge(int[][] intervals) {

        LinkedList<int[]> output = new LinkedList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        output.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){

            var prevInter = output.get(output.size() - 1);
            if(prevInter[1] < intervals[i][0]){
                output.add(intervals[i]);
            } else if(intervals[i][0] < prevInter[0]){
                output.add(intervals[i]);
            } else {
                var mergedInterval = new int[]{ Math.min(prevInter[0], intervals[i][0]),
                        Math.max(prevInter[1], intervals[i][1])};
                output.set(output.size() - 1,mergedInterval);
            }
        }
        return output.toArray(new int[output.size()][2]);

    }

    //approach 2
    //T: O(N logn)
    //S:O(N)
    public int[][] merge2(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        LinkedList<int[]> output = new LinkedList<>();
        for(int[] interval : intervals){
            if(output.isEmpty() || output.getLast()[1] < interval[0]){
                output.add(interval);
            } else {
                //O(1) as the head has the reference to the last element
                output.getLast()[1] = Math.max(output.getLast()[1], interval[1]);
            }
        }
        return output.toArray(new int[output.size()][2]);
    }

}
