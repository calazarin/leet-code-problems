package com.lazarin.learning.leetcode.topologicalsort;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

    public int[] topoSort(int v, ArrayList<ArrayList<Integer>> adjList) {
        int[] visited = new int[v];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < v; i++){
            if(visited[i] != 0){
                dfs(i, visited, stack,adjList);
            }
        }
        int[] answer = new int[v];
        int i = 0;
        while(!stack.isEmpty()){
            answer[i] = stack.peek();
            stack.pop();
            i++;
        }
        return answer;
    }

    private void dfs(int i, int[] visited, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adjList) {
        //mark node as visited
        visited[i] = 1;
        for(Integer node : adjList.get(i)){
            if(visited[node] == 0){
                dfs(node, visited, stack, adjList);
            }
        }
        stack.push(i);
    }
}
