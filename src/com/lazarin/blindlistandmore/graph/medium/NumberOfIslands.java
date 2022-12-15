package com.lazarin.blindlistandmore.graph.medium;

public class NumberOfIslands {

    public static void main(String args[]){

    }


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

    /*private static void bfs(int r, int c, HashSet<String> visitedPositions, char[][] grid){
        Queue<String> queue = new LinkedList<>();
        visitedPositions.add(r+","+c);
        queue.add(r+","+c);
        while (!queue.isEmpty()){
            String position = queue.poll();

            int[][] directions = new int[][]{
                    {1, 0}, {-1, 0}, {0, 1}, {0, -1}
            };

            for(int[] dir : directions){
                var dr = dir[0];
                var dc = dir[1];

                var newRowP = Integer.valueOf(position.split(",")[0]) + dr;
                var newColumP = Integer.valueOf(position.split(",")[1]) + dc;

                if (newRowP <= grid.length &&
                    newColumP <= grid[0].length &&
                    grid[newRowP][newColumP] == '1' &&
                    !visitedPositions.contains(newRowP + "," + newColumP)) {
                    queue.add(newRowP+","+newColumP);
                }
            }
        }
    }

    public int numIslands(char[][] grid) {

        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }

        var rows = grid.length;
        var columns = grid[0].length;

        HashSet<String> visitedPositions = new HashSet<>();
        int islands = 0;

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                if(grid[r][c] == '1' && !visitedPositions.contains(r+","+c)){
                    bfs(r,c);
                    islands+=1;
                }
            }
        }
        return islands;

        //starting from the top left corner
        //is my vertex island?
        //if so, starting search for more land (run_more_land_search)
        //if not move to up, down, left or right
            //if prev vertex is water, new island found, lets find the island length and look for a new one

        //def run_more_land_search
        //can I go to right? if so move and mark prev as visited
        //can I go to right again?
            //if not, I can go to bottom? if so move and mark prev as visited
        //can I go to bottom again?
            //if not, can I go to right?
            //if not, can I go to top? no because I already visited it
            //can I go to left? if so, move and mark prev as visited
        //If all paths visited, we visited the entire island
        //count +1 possible islands

    }*/


}
