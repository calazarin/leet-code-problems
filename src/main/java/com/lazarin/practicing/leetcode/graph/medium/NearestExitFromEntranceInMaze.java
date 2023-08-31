package com.lazarin.practicing.leetcode.graph.medium;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/nearest-exit-from-entrance-in-maze
public class NearestExitFromEntranceInMaze {


    /** approach 1 - BFS; T:O(m*n); S:O(m*n)
     *  - use a queue as the container to store all the cells to be visited
     *  - also we need to mark a cell as visited and skip them in the next searches
     */
    public int nearestExit(char[][] maze, int[] entrance) {

        int rows = maze.length;
        int cols = maze[0].length;

        int[][] directions = new int[][]{
                {1, 0}, //down
                {-1, 0}, //up
                {0, 1}, //right
                {0, -1} //left
        };

        //mark entrance as visited
        int startRow = entrance[0];
        int startCol = entrance[1];

        maze[startRow][startCol] = '+'; //+ sign will be used a visited cells

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startRow, startCol, 0}); //0 is the distance

        while(!queue.isEmpty()){

            int[] currState = queue.poll();
            int currRow = currState[0];
            int currCol = currState[1];
            int currDistance = currState[2];

            for(int[] dir : directions) { //check the neighbors

                int nextRow = currRow + dir[0], nextCol = currCol + dir[1];

                if(0 <= nextRow && nextRow < rows &&  0 <= nextCol && nextCol < cols &&
                        maze[nextRow][nextCol] == '.'){

                    //check if it is an exit
                    if(nextRow == 0 || nextRow == rows - 1 || nextCol == 0 || nextCol == cols -1){
                        return currDistance + 1;
                    }

                    //if not, add into the queue and mark as visited
                    maze[nextRow][nextCol] = '+';
                    queue.offer(new int[]{nextRow, nextCol, currDistance + 1});
                }

            }
        }
        return -1;
    }
}
