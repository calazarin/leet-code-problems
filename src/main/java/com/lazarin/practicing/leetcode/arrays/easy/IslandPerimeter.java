package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//https://leetcode.com/problems/island-perimeter/
public class IslandPerimeter {

    public static void main(String args[]){

        /*Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
        Output: 16
        Explanation: The perimeter is the 16 yellow stripes in the image above.*/

        IslandPerimeter isp = new IslandPerimeter();
        System.out.println(
                isp.islandPerimeter(new int[][]{
                        {0,1,0,0},{1,1,1,0},{0,1,0,0}, {1,1,0,0}
                }));

        System.out.println(
                isp.islandPerimeter2(new int[][]{
                        {0,1,0,0},{1,1,1,0},{0,1,0,0}, {1,1,0,0}
                }));

     /*   Input: grid = [[1]]
        Output: 4*/
        System.out.println(
                isp.islandPerimeter(new int[][]{
                        {1}
                }));
        System.out.println(
                isp.islandPerimeter2(new int[][]{
                        {1}
                }));

       /* Input: grid = [[1,0]]
        Output: 4*/
        System.out.println(
                isp.islandPerimeter(new int[][]{
                        {0,1}
                }));
        System.out.println(
                isp.islandPerimeter2(new int[][]{
                        {0,1}
                }));
    }
    /*
        0-1-0-0 => 0,0 -> 0,1 -> 0,2 -> 0,3
        1-1-1-0 => 1,0 -> 1,1 -> 1,2 -> 1,3
        0-1-0-0 => 2,0 -> 2,1 -> 2,2 -> 2,3

     */

    //approach 1 - brute force
    //T: O(n*m)
    //S: O(1)
    public int islandPerimeter(int[][] grid) {

        int x = grid.length;
        int y = grid[x - 1].length;
        int perimeter = 0;

        for(int i = 0; i < x; i++){ //x = 0//rows

            for(int j = 0; j < y; j++) { //y = 1//columns

                int cp = grid[i][j]; //0,1

                if(cp == 1){ // (true)

                    if(j - 1 < 0 || grid[i][j - 1] == 0) perimeter++; //[0,0]
                    if(i - 1 < 0 || grid[i - 1][j] == 0) perimeter++; //[-1,1]
                    if(j + 1 >= y || grid[i][j + 1] == 0) perimeter++;
                    if(i + 1 >= x || grid[i + 1][j] == 0) perimeter++;

                }
            }
        }

        return perimeter;
    }

    //approach 2 - DFS
    //T: O(n*m)
    //S: O(n*m)
    public int islandPerimeter2(int[][] grid) {
        Set<Position> visited = new HashSet<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    return dfs(i, j, grid, visited);
                }
            }
        }
        return 0;
    }

    private int dfs(int i, int j, int[][] grid, Set<Position> visited){

        if(i < 0 ||  j < 0 || i >= grid.length ||
                j >= grid[0].length || grid[i][j] == 0){
            return 1;
        }
        var pos = new Position(i ,j);
        if(visited.contains(pos)){
            return 0;
        }

        visited.add(pos);

        int perim = dfs(i, j + 1, grid, visited);
        perim += dfs(i, j - 1, grid, visited);
        perim += dfs(i - 1, j, grid, visited);
        perim += dfs(i + 1, j, grid, visited);

        return perim;
    }

    private class Position{
        int x;
        int y;
        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return x == position.x && y == position.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
