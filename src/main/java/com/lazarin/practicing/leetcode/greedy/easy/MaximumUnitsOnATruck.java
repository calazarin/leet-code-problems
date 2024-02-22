package com.lazarin.practicing.leetcode.greedy.easy;

import java.util.Arrays;
import java.util.PriorityQueue;

//https://leetcode.com/problems/maximum-units-on-a-truck/
public class MaximumUnitsOnATruck {

    //approach 1 - greedy + maxheap
    //T: O(n*logn)
    //S: O(n)
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        //maxHeap ordered by box size in the decreasing order
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for(int[] r : boxTypes){
            maxheap.offer(r);
        }

        int amountOfUnits = 0; //8
        while(truckSize > 0 && !maxheap.isEmpty()) { //0
            int[] curr = maxheap.poll();
            int qt = curr[0]; //2
            int boxSize = curr[1]; //2

            if(truckSize - qt >= 0) {
                amountOfUnits += qt * boxSize;
            } else {
                amountOfUnits += truckSize * boxSize;
            }

            truckSize -= qt;
        }
        return amountOfUnits;
    }

    //approach 2 - greedy + sorting the input
    //T: O(n logn)
    //S: O(1)
    public int maximumUnits_2(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int ans = 0;

        for (int[] box : boxTypes) {

            int count = Math.min(box[0], truckSize);
            ans += count * box[1];
            truckSize -= count;

            if (truckSize == 0) {
                return ans;
            }
        }
        return ans;
    }
}
