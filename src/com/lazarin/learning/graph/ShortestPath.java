package com.lazarin.learning.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShortestPath {

    public static void main(String args[]){

        char[][] edges = new char[][] {
                {'w', 'x'},
                {'x','y'},
                {'z', 'y'},
                {'z', 'v'},
                {'w', 'v'},
        };

        var graph = edgesToGraph(edges);
        var result = shortestPath2(graph, Character.valueOf('w'), Character.valueOf('z'));
        System.out.println(result);

    }

    public static Map<Character, List<Character>> edgesToGraph(char[][] edges){
        Map<Character, List<Character>> graph = new HashMap<>();

        for(char[] edge : edges){

            Character elemtA = Character.valueOf(edge[0]);
            Character elemtB = Character.valueOf(edge[1]);

            if(!graph.containsKey(elemtA)){
                graph.put(elemtA, new ArrayList<>());
            }

            if(!graph.containsKey(elemtB)){
                graph.put(elemtB, new ArrayList<>());
            }

            graph.get(elemtA).add(elemtB);
            graph.get(elemtB).add(elemtA);
        }

        return graph;
    }

    public static int shortestPath2(Map<Character, List<Character>> graph, Character nodeA, Character nodeB){

        Set<Character> visited = new HashSet<>();

        LinkedList<QueueElement> queue = new LinkedList<>();
        queue.add(new QueueElement(nodeA, 0));
        visited.add(nodeA);
        while(!queue.isEmpty()){
            //nodeValue;distance
            var queueElement = queue.pop();
            if(queueElement.vertexValue == nodeB) return  queueElement.distance;
            for(Character neighbor : graph.get(queueElement.vertexValue)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    //it is a neighbor, so lets increase the distance
                    queue.add(new QueueElement(neighbor, queueElement.distance + 1));
                }
            }
        }
        return -1;
    }
}
