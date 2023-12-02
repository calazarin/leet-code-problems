package com.lazarin.practicing.leetcode.intervals.medium;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons
public class MinimumNumberOfArrowsToBurstBalloons {

    /**
     * approach 1 - sort by end of interval
     * then find overlapping intervals
     * T: O(nlogn)
     * S: O(1)
     */
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int prevEnd = points[0][1];
        int shots = 1;

        for(int i = 1; i < points.length; i++) {
            int currEnd  = points[i][1];
            int currStart = points[i][0];

            if(currStart > prevEnd){
                shots++;
                prevEnd = currEnd;
            }
        }

        return shots;
    }
}
