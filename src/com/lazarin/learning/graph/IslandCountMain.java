package com.lazarin.learning.graph;

import java.util.HashSet;
import java.util.Set;

public class IslandCountMain {

    public static void main(String args[]){
        var grid = new char[][]{
                {'W','L','W','W','W'},
                {'W','L','W','W','W'},
                {'W','W','W','L','W'},
                {'W','W','L','L','W'},
                {'L','W','W','L','L'},
                {'L','L','W','W','W'}
        };
        var counter = islandCount(grid);
        System.out.println("Island count is: "+counter);
    }

    public static int islandCount(char[][] grid){
        int count = 0;
        Set<String> visitedNodes = new HashSet<>();
        for(int r = 0; r < grid.length; r++){
            System.out.println("** "+grid[0].length);
            System.out.println("** "+grid[0].length);
            for(int c = 0; c < grid[r].length; c++){
                if(explore(grid, r, c, visitedNodes)){
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean explore(char[][] grid, int r, int c, Set<String> visitedNodes) {

        var rowInbound = r >= 0 && r < grid.length;
        var columnInbound = c >= 0 && c < grid[0].length;
        if(!rowInbound || !columnInbound) return false;

        if(grid[r][c] == 'W') return false;

        var currentPosition = r +","+c;
        if(visitedNodes.contains(currentPosition)) return false; //not a new island!
        visitedNodes.add(currentPosition);

        explore(grid, r - 1, c, visitedNodes); //deep traversal going up
        explore(grid, r + 1, c, visitedNodes); //deep traversal going down
        explore(grid, r, c - 1, visitedNodes); //deep traversal going left
        explore(grid, r, c + 1, visitedNodes); //deep traversal going right

        return true;
    }
}
