package com.lazarin.learning.graph;

import java.util.HashSet;
import java.util.Set;

public class MinSizeIslandMain {

    public static void main(String args[]){

        var grid = new char[][]{
                {'W','L','W','W','W'},
                {'W','L','W','W','W'},
                {'W','W','W','L','W'},
                {'W','W','L','L','W'},
                {'L','W','W','L','L'},
                {'L','L','W','W','W'}
        };
        var counter = minimumIslandCounter(grid);
        System.out.println("Minimum island count is: "+counter);

    }

    private static int minimumIslandCounter(char[][] grid) {

        Set<String> visitedNodes = new HashSet<>();

        var minSize = Integer.MAX_VALUE;

        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                //explore map and visit nodes to find islands
                var counter = explore(grid, r, c, visitedNodes);
                if(counter > 0 && counter < minSize){
                    minSize = counter;
                }
            }
        }
        return minSize;
    }

    private static int explore(char[][] grid, int r, int c, Set<String> visitedNodes) {

        boolean rowInbound = r >= 0 && r < grid.length;
        boolean columnInbound = c >= 0 && c < grid[0].length;

        if(!rowInbound || !columnInbound) return 0;
        if (grid[r][c] == 'W') return 0;

        if(visitedNodes.contains(r + "," + c)) return 0;
        visitedNodes.add(r + "," + c);

        var islandSize = 1;
        islandSize += explore(grid, r + 1, c, visitedNodes);
        islandSize += explore(grid, r - 1, c, visitedNodes);
        islandSize += explore(grid, r, c + 1, visitedNodes);
        islandSize += explore(grid, r, c - 1, visitedNodes);

        return islandSize;
    }


}
