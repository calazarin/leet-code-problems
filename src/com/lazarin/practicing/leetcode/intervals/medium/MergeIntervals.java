package com.lazarin.practicing.leetcode.intervals.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

//https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {

    public static void main(String args[]){
      /*  Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        Output: [[1,6],[8,10],[15,18]]
        Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].*/
        printArrays(merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}));

      /*  Input: intervals = [[1,4],[4,5]]
        Output: [[1,5]]
        Explanation: Intervals [1,4] and [4,5] are considered overlapping.*/
        printArrays(merge(new int[][]{{1,4}, {4,5}}));
    }

    public static int[][] merge(int[][] intervals) {

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

    private static void printArrays(int[][] toBePrinted){
        for(int i = 0; i < toBePrinted.length; i++){
            for(int j = 0; j < toBePrinted[i].length; j++){
                System.out.print(toBePrinted[i][j]+",");
            }
            System.out.print("\n");
        }
    }

    //T: O(N logn)
    //S:O(N)
    public static int[][] merge2(int[][] intervals) {

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
//i = 3
//output: [1,3], [4,8], [10,17], 19,21
//intervals[i] = 19,21
//mergedInterval =

//...1___3................................................ i
//.........4_____8........................................ i + 1
//...................10______________15................... i + 2
//...........................11______________16........................... i + 3
//...............................13______17............... i + 4
//............................................19...21..... i + 5
//[1,3][4,16][19,21]

//...............4----8........................... i (current)
//.........................9--12.................. i - 1  (current)

//.....1----3............................. i
//.......2-----6.......................... i + 1
//.................8---10................. i + 2
//.............................15----18... i + 3
