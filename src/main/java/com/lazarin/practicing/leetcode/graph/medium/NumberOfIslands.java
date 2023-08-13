package com.lazarin.practicing.leetcode.graph.medium;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {

        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }

        var totalOfIslands = 0;
        var rows = grid.length;
        var columns = grid[0].length;

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){

                if(grid[r][c] == '1'){
                    totalOfIslands += dfs(r, c, grid);
                }
            }
        }

        return totalOfIslands;
    }

    public int dfs(int r, int c, char[][] grid){
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == '0'){
            return 0;
        }

        grid[r][c] = '0'; //flip it to water as we already visited this position

        //now dfs on all directions
        dfs(r, c + 1, grid);
        dfs(r, c - 1, grid);
        dfs(r + 1, c, grid);
        dfs(r - 1, c, grid);
        return 1;
    }

}
