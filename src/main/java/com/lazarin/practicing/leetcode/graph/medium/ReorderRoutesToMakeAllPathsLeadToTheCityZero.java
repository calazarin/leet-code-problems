package com.lazarin.practicing.leetcode.graph.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero
public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {

    /**
     * approach 1 - using 1 to indicate outgoing edge and -1 to indicate incoming edge
     * T: O(N) where N is the number of nodes in the tree
     * S: O(N) - we need a boolean array and adjacency list with N space
     */
    public int minReorder(int n, int[][] connections){
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] connection : connections){
            int source = connection[0];
            int dest = connection[1];
            adjList.get(source).add(dest);
            adjList.get(dest).add(-source);
        }
        boolean[] visited = new boolean[n];
        return dfs(adjList, visited, 0);
    }

    private int dfs(List<List<Integer>> adjList, boolean[] visited, int currentCity) {

        int changes = 0;
        visited[currentCity] = true;

        for(int neighbor : adjList.get(currentCity)){

            int neighborAbs = Math.abs(neighbor);

            //if neighbor was not visited yet, travel to it
            if(!visited[neighborAbs]){
                //if neighbor has a positive sign means it is an outgoing edge; we need to reverse it
                changes += dfs(adjList, visited, neighborAbs)
                        + (neighbor > 0 ? 1 : 0);
            }
        }

        return changes;
    }

    /**
     * approach 2 - BFS
     */
    public int minReorder2(int n, int[][] connections) {
        List<List<Integer>> adjList = new ArrayList<>();
        //builds the adjacency list not considering edges direction
        for(int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] connection : connections){
            int source = connection[0];
            int destination = connection[1];
            adjList.get(source).add(destination); //there is an edge from source to destination
            adjList.get(destination).add(-source);//there is an edge from destination to source
        }
        boolean[] visited = new boolean[n];
        int counter = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;

        while(!queue.isEmpty()){
            int currentCity = queue.poll();
            for(int neighbor : adjList.get(Math.abs(currentCity))){

                if(visited[Math.abs(neighbor)]){
                    continue;
                }
                queue.add(neighbor);
                visited[Math.abs(neighbor)] = true;
                counter += neighbor > 0 ? 1 : 0;
            }
        }

        return counter;
    }
}



