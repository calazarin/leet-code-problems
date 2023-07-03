package com.lazarin.practicing.leetcode.google.frequentquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/meeting-rooms-ii/
public class MeetingRoomsII {

    public static void main(String args[]){

       /* Input: intervals = [[0,30],[5,10],[15,20]]
        Output: 2*/
        System.out.println(minMeetingRooms(new int[][]{{0,30}, {5,10}, {15,20}}));

       /* Input: intervals = [[7,10],[2,4]]
        Output: 1*/
        System.out.println(minMeetingRooms(new int[][]{{7,10}, {2,4}}));
    }

    /*
    Solution:
    1. Sort the given meeting by their start ime
    2. Initialize a new min heap and add the first meeting's ending time to the heap;
    If ending times, we can easily identify if a room is going to be free soon
    3. If a room is free, we extract the topmost element and update with the new ending time of the
    new meeting
    4. If not, we allocate a new room
    6. After processing all meeting, the size of heap tell us the amount of rooms needed
     */
    //Time complexity: O (N log N) -> sorting N element
    //Also, extraction of mini-heap takes O(log N)
    //Space complexity O (N) for mini heap with N elements
    public static int minMeetingRooms(int[][] intervals) {

        if(intervals.length == 0){
            return 0;
        }
        //min heap
        //size, comparator
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(intervals.length, Comparator.comparingInt(a -> a));
        //sorting intervals by start time
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        //add the first meeting
        minHeap.add(intervals[0][1]);

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= minHeap.peek()){ //checking if start time is equals or after the top priority and free space if so
                minHeap.poll();
            }
            //then add the new meeting ending time to min-heap
            minHeap.add(intervals[i][1]);
        }

        return minHeap.size();
    }
}
