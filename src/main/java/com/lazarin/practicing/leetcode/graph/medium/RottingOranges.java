package com.lazarin.practicing.leetcode.graph.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/rotting-oranges
public class RottingOranges {

    //approach 1 - BFS - T:O(m*n); S:O(m*n)
    public int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int time = 0, fresh = 0;
        int[][] directions = new int[][]{ {1,0}, {0,1}, {-1,0}, {0,-1}};
        Queue<int[]> queue = new LinkedList<>();

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++) {
                if(grid[r][c] == 1){
                    fresh++;
                }
                if(grid[r][c] == 2){
                    queue.add(new int[]{r, c});
                }
            }
        }

        while(!queue.isEmpty() && fresh > 0){
            int queueSize = queue.size();
            for(int i = 0; i < queueSize; i++){
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                for(int[] dir : directions){
                    int nextRow = dir[0] + r;
                    int nextCol = dir[1] + c;

                    //if in bounds and fresh, make rotten
                    if(nextRow < 0 || nextRow == rows || nextCol < 0 || nextCol == cols || grid[nextRow][nextCol] != 1){
                        continue;
                    }

                    grid[nextRow][nextCol] = 2;
                    queue.add(new int[]{nextRow, nextCol});
                    fresh -= 1;
                }
            }

            time += 1;
        }
        return fresh == 0 ? time : -1;
    }

    //approach 2 - BFS
    public int orangesRotting2(int[][] grid) {

        Set<String> fresh = new HashSet<>(); //stores fresh oranges coordinates
        Set<String> rotten = new HashSet<>(); //stores rotten oranges coordinates

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                String key = "" + i + j;
                if(grid[i][j] == 1){
                    fresh.add(key);
                } else if(grid[i][j] == 2){
                    rotten.add(key);
                }
            }
        }

        int minutes = 0;
        int[][] directions = new int[][] { {0,1}, {1,0}, {-1,0}, {0, -1}};

        while(fresh.size() > 0) {

            Set<String> infected = new HashSet<>();

            for(String s : rotten) {
                int i = s.charAt(0) - '0';
                int j = s.charAt(1) - '0';

                for (int[] direction : directions) {
                    int nextI = i + direction[0];
                    int nextJ = j + direction[1];
                    String key = "" + nextI + nextJ;
                    if (fresh.contains(key)) {
                        fresh.remove(key);
                        infected.add(key);
                    }
                }
            }

            if(infected.size() == 0){
                return -1;
            }

            rotten = infected;
            minutes++;
        }
        return minutes;
    }
}
