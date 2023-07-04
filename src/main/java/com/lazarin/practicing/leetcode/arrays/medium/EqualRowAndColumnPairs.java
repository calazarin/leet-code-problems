package com.lazarin.practicing.leetcode.arrays.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/equal-row-and-column-pairs
public class EqualRowAndColumnPairs {

    public int equalPairs(int[][] grid) {
        int answer = 0;
        List<String> rowSet = new ArrayList<>();
        Set<String> colSet = new HashSet<>();

        for(int i = 0; i < grid.length; i++){ //O (n*m)
            StringBuilder row = new StringBuilder();
            for(int j = 0; j < grid[i].length; j++){
                row.append(grid[i][j]+",");
            }
            rowSet.add(row.toString());
        }

        for(int i = 0; i < grid.length; i++){ //O (n*m)

            StringBuilder column = new StringBuilder();

            for(int j = 0; j < grid[i].length; j++){
                column.append(grid[j][i]+",");
            }

            colSet.add(column.toString());
        }

        for(String row : rowSet){
            if(colSet.contains(row)){
                answer++;
            }
        }

        return answer;
    }
}
