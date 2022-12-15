package com.lazarin.blindlistandmore.intervals.medium;

import java.util.Arrays;

//https://leetcode.com/problems/meeting-rooms/
public class MeetingRooms {

    public static void main(String args[]){
        /*Input: intervals = [[0,30],[5,10],[15,20]]
        Output: false*/
        System.out.println(canAttendMeetings(new int[][]{ {0,30}, {5,10}, {15,20}}));

       /* Input: intervals = [[7,10],[2,4]]
        Output: true*/
        System.out.println(canAttendMeetings(new int[][]{ {7,10}, {2,4}}));

        //[[6,15],[13,20],[6,17]]
        //false
        System.out.println(canAttendMeetings(new int[][]{ {6,15}, {13,20}, {6,17}}));

    }


    public static boolean canAttendMeetings(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            for(int i = 0; i < intervals.length - 1; i++){
                if(intervals[i][1] > intervals[i + 1][0]){
                    return false;
                }
            }
            return true;
    }
}
