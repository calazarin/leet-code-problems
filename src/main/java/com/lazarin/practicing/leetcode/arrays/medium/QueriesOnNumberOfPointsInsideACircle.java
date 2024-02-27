package com.lazarin.practicing.leetcode.arrays.medium;

//https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/description/
public class QueriesOnNumberOfPointsInsideACircle {

    //approach - brute force + geometry ( ((x1-x2)^2 + (y1-y2)^2)^2 )
    //T: O(n*m)
    //S:O(1)
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        int queryCount = 0;
        for (int[] query : queries) {

            int x = query[0]; //1
            int y = query[1]; //1
            int r = query[2]; //2

            for (int[] point : points) {

                int px = point[0];
                int py = point[1];

                px = px - x;
                py = py - y;

                double d = Math.sqrt((px * px) + (py * py));
                if (d <= r) {
                    ans[queryCount] += 1;
                }
            }
            queryCount++;
        }
        return ans;
    }
}
