package com.lazarin.learning.leetcode.recursion.graphs;

import java.util.Set;

public class GraphMain {

    public static boolean depthFirstSearch(GraphNode node, Set<GraphNode> visited, int goal){
        //first base case
        if(node == null) return false;
        //second base case
        if(node.value == goal) return true;

        for(GraphNode neighbor : node.neighbors){

            if(visited.contains(neighbor)) continue;

            visited.add(neighbor);
            boolean isFound = depthFirstSearch(neighbor, visited, goal);
            if(isFound) return true;

        }
        return false;
    }
}
