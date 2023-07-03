package com.lazarin.learning.leetcode.graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LargestComponentMain {

    public static void main(String args[]){


        Map<Integer, List<Integer>> graph = createGraph();

        var result = largestComponent(graph);
        System.out.println(result);

    }

    public static Map<Integer, List<Integer>> createGraph(){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(8, 1, 5));
        graph.put(1, Arrays.asList(0));
        graph.put(5, Arrays.asList(8, 1, 5));
        graph.put(8, Arrays.asList(0, 5));
        graph.put(2, Arrays.asList(3,4));
        graph.put(3, Arrays.asList(2,4));
        graph.put(4, Arrays.asList(3,2));
        return graph;
    }

    public static int largestComponentRecursively(Map<Integer, List<Integer>> graph){
        Set<Integer> visitedNodes  = new HashSet<>();
        int longest = 0;
        for(Integer vertex : graph.keySet()){
            var size = exploreSize(graph, vertex, visitedNodes);
            if(size > longest) longest = size;
        }
        return longest;
    }

    public static int exploreSize(Map<Integer, List<Integer>> graph, Integer currentVertex, Set<Integer> visitedNodes){

        if(visitedNodes.contains(currentVertex)) return 0;
        var size = 1;
        visitedNodes.add(currentVertex);
        for(Integer neighbor: graph.get(currentVertex)){
            size += exploreSize(graph, neighbor, visitedNodes);
        }
        return size;
    }

    public static int largestComponent(Map<Integer, List<Integer>> graph){

        int largestCounter = Integer.MIN_VALUE;

        Set<Integer> allVertex = graph.keySet();
        Set<Integer> visitedNodes = new HashSet<>();

        for(Integer vertex : allVertex){

            if(!visitedNodes.contains(vertex)){
                int currentGraphCounter = 0;
                LinkedList<Integer> queue = new LinkedList<>();
                queue.add(vertex);

                while(!queue.isEmpty()){
                    Integer currentVertex = queue.pop();
                    if(!visitedNodes.contains(currentVertex)) {
                        visitedNodes.add(currentVertex);
                        currentGraphCounter++;
                        for (Integer neighbor : graph.get(currentVertex)) {
                            queue.add(neighbor);
                        }
                    }
                }

                if(currentGraphCounter > largestCounter) {
                    largestCounter = currentGraphCounter;
                }

            }
        }

        return largestCounter;
    }
}
