package com.lazarin.practicing.leetcode.arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/equal-row-and-column-pairs
public class EqualRowAndColumnPairs {

    /* brute force
      T: O(n^3)
      S: O(1)
     */
    public int equalPairs(int[][] grid) {
        int count = 0;

        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid.length; c++){

                boolean valid = true;
                for(int i = 0; i < grid.length; i++){

                    if(grid[r][i] != grid[i][c]){
                        valid = false;
                        break;
                    }

                }
                if(valid) count++;
            }
        }

        return count;
    }

    /* optimal
     T: O(n^2)
    S: O(n^2)
    */
    public int equalPairs2(int[][] grid) {
        int counter = 0;
        //arrays cannot be used as keys so we need to use Strings
        Map<String, Integer> rowCounter = new HashMap<>();

        for(int[] row: grid){
            String rowString = Arrays.toString(row);
            rowCounter.put(rowString, rowCounter.getOrDefault(rowString, 0) + 1);
        }

        for(int c  = 0; c < grid.length; c++){
            int[] column = new int[grid.length];
            for(int r = 0; r < grid.length; r++){
                column[r] = grid[r][c];
            }
            counter += rowCounter.getOrDefault(Arrays.toString(column), 0);
        }
        return counter;
    }
}
