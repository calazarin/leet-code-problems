package com.lazarin.blindlist.intervals.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

//https://leetcode.com/problems/insert-interval/
public class InsertInterval {

    public static void main(String arsg[]){
       /* Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
        Output: [[1,5],[6,9]]*/
       printArrays(insert(new int[][]{{1,3},{6,9}}, new int[]{2,5}));

       /* Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
        Output: [[1,2],[3,10],[12,16]]
        Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].*/
        printArrays(insert(new int[][]{{1,2},{3,5}, {6,7}, {8,10}, {12,16}},
                new int[]{4,8}));
    }

    private static void printArrays(int[][] toBePrinted){
        for(int i = 0; i < toBePrinted.length; i++){
            for(int j = 0; j < toBePrinted[i].length; j++){
                System.out.print(toBePrinted[i][j]+",");
            }
            System.out.print("\n");
        }
    }

    //Approach 1 - greedy algorithm - one pass strategy
    //1.Add to the output all intervals starting before newInterval
    //2.Add to the output newInterval, merge it with the last added interval if needed
    //3. Add the next intervals one by one, merge if needed
    //Time complexity: O(N) since it's one pass along the input array.
    //Space complexity : O(N) to keep the output.
    public static int[][] insert(int[][] intervals, int[] newInterval) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int newStart = newInterval[0];
        int newEnd = newInterval[1];

        LinkedList<int[]> output = new LinkedList<>();

        for(int i = 0; i < intervals.length; i++) {
            //if new interval comes first
            if (newEnd < intervals[i][0]) {
                output.add(newInterval);
                //add all other remaining intervals and return the result
                addOtherIntervalsToOutput(output, intervals, i);
                return output.toArray(new int[output.size()][2]);
            } else if (newStart > intervals[i][1]) { //if new interval comes after current interval, add current interval
                output.add(intervals[i]);
            } else {
                newInterval = new int[]{
                        Math.min(intervals[i][0], newInterval[0]), Math.max(intervals[i][1], newInterval[1])};
            }
        }
        output.add(newInterval);
        return output.toArray(new int[output.size()][2]);
    }

    private static void addOtherIntervalsToOutput(LinkedList<int[]> output, int[][] intervals, int startIndex) {
        for(int i = startIndex; i < intervals.length; i++) {
            output.add(intervals[i]);
        }
    }
}
