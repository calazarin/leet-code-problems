package com.lazarin.practicing.leetcode.graph.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/pacific-atlantic-water-flow/
public class PacificAtlanticWaterFlow {

    //Time: O(m*n)
    //Space: O(m*n)
   public List<List<Integer>> pacificAtlantic(int[][] heights) {

        List<List<Integer>> result = new ArrayList<>();

        if(heights == null || heights[0].length == 0){
            return result;
        }

        int row = heights.length;
        int colum = heights[0].length;

        boolean[][] atlantic = new boolean[row][colum];
        boolean[][] pacific = new boolean[row][colum];

        //dfs
        for(int c = 0; c < colum; c++){
            dfs(heights, 0, c, Integer.MIN_VALUE, pacific);
            dfs(heights, row - 1, c, Integer.MIN_VALUE, atlantic);
        }
        for(int r = 0; r < row; r++){
            dfs(heights, r, 0, Integer.MIN_VALUE, pacific);
            dfs(heights, r, colum - 1, Integer.MIN_VALUE, atlantic);
        }

        //preparing the result
        for(int i = 0; i < row; i++){
            for(int j = 0; j < colum; j++){
                if(atlantic[i][j] && pacific[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }

    private void dfs(int[][]matrix, int i, int j, int prev, boolean[][]ocean){

        if(i < 0 || i >= ocean.length || j < 0 || j >= ocean[0].length) return;
        if(matrix[i][j] < prev || ocean[i][j]) return;

        ocean[i][j] = true;

        dfs(matrix, i, j + 1, matrix[i][j], ocean);

        dfs(matrix, i + 1, j, matrix[i][j], ocean);
        dfs(matrix, i, j - 1, matrix[i][j], ocean);
        dfs(matrix, i - 1, j, matrix[i][j], ocean);
    }
}
