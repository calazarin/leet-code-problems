package com.lazarin.practicing.leetcode.heap.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

//https://leetcode.com/problems/delete-greatest-value-in-each-row/description/
public class DeleteGreatestValueInEachRow {

    //approach 1 - BRUTE FORCE - O(N * logn)
    //T: O(m * n + nlogn) where n is the number of columns and m rows
    public int deleteGreatestValue(int[][] grid) {

        int n = grid.length;
        int m = grid[n - 1].length;

        int count = m;
        int answer = 0;
        while(count > 0) {
            int maxInRows = Integer.MIN_VALUE;
            for(int[] row : grid) {
                Arrays.sort(row);
                int max = row[m - 1];
                row[m - 1] = -1;
                maxInRows = Math.max(max, maxInRows);
            }
            answer += maxInRows;
            count--;
        }
        return answer;
    }

    //approach 2 - max heap
    public int deleteGreatestValue_2(int[][] grid) {
        ArrayList<PriorityQueue<Integer>> pQueueList = new ArrayList<>();

        int rows = grid.length;
        int columns = grid[0].length;

        for(int i = 0; i < rows; i++) {
            PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b - a);
            for(int j = 0; j < columns; j++){
                queue.add(grid[i][j]);
            }
            pQueueList.add(queue);
        }

        int result = 0;
        for(int i = 0; i < columns; i++) {
            int num = -1;
            for(int j = 0; j < rows; j++){
                PriorityQueue<Integer> queue = pQueueList.get(j);
                int tmp = queue.poll();
                num = Math.max(tmp, num);
            }
            result+=num;
        }
        return result;

    }

    //approach 3 - (brute force 2) - T: O(m * n + nlogn) where n is the number of columns and m rows
    public int deleteGreatestValue_3(int[][] grid) {

        for(int[] row : grid) {
            Arrays.sort(row);//O(n*logn)
        }

        int sum = 0;
        int columns = grid[0].length;
        int rows = grid.length;

        for(int i = columns - 1; i >= 0; i--) { //O(n*m)
            int max = 0;
            for(int j = 0; j < rows; j++) {
                max = Math.max(max,grid[j][i]);
            }
            sum += max;
        }

        return sum;
    }
}
