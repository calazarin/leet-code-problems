package com.lazarin.blindlist.intervals.medium;

import java.util.Arrays;

//https://leetcode.com/problems/meeting-rooms-ii/
public class MeetingRooms2 {

    public static void main(String args[]){
        /*Input: intervals = [[0,30],[5,10],[15,20]]
        Output: 2*/
        System.out.println(minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}}));

     /*   Input: intervals = [[7,10],[2,4]]
        Output: 1*/
        System.out.println(minMeetingRooms(new int[][]{{7,10},{2,4}}));
    }

    //O (n log n)
    public static int minMeetingRooms(int[][] intervals) {

        int[] starts = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            starts[i] = intervals[i][0];
        }

        int[] ends = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            ends[i] = intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int res = 0, count = 0;
        int s = 0, e = 0;
        while(s < intervals.length) {
            if (starts[s] < ends[e]) {
                s++;
                count++;
            } else {
                e++;
                count--;
            }
            res = Math.max(res, count);
        }
        return count;
    }

}
