package com.lazarin.practicing.leetcode.graph.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

//https://leetcode.com/problems/graph-valid-tree/
public class GraphValidTree {

    public static void main(String args[]){

    }

    //T: O(N+E) where E is the # of edges and N the # of nodes
    //S: O(N+E)
    public boolean validTree(int n, int[][] edges) {

        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        //0: 1,2,3
        //1: 0,4
        //2: 0
        //3: 0
        //4: 1

        Stack<Integer> stack = new Stack<>();
        stack.add(0);

        Map<Integer, Integer> parentNodes = new HashMap<>();
        parentNodes.put(0, -1);

        while(!stack.empty()){
            Integer node = stack.pop();
            List<Integer> neighbours = adjList.get(node);
            for(Integer neighbour : neighbours){
                if(parentNodes.get(node) == neighbour){ //undirected graph, so we dont want to visit the node we are coming from again
                    continue;
                }
                if(parentNodes.containsKey(neighbour)){ //we already visited this node, we dont want to visit again
                    return false;//trivial cycle here
                }
                stack.push(neighbour);
                parentNodes.put(neighbour, node);
            }
        }
        return parentNodes.size() == n;
    }

    public boolean validTree2(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        Set<Integer> visited = new HashSet<>();
        return dfs(0, -1, visited, adjList) && visited.size() == n;
    }

    private boolean dfs(int node, int previous, Set<Integer> visited,  List<List<Integer>> adjList){
        if(visited.contains(node)){
            return false;
        }
        visited.add(node);
        for(Integer neighbour :adjList.get(node)){
            if(neighbour == previous){
                continue;
            }
            if(!dfs(neighbour, node, visited, adjList)){
                return false;
            }
        }
        return true;
    }
}
