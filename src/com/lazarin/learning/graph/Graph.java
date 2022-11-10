package com.lazarin.learning.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Graph {

    public Map<Vertex, List<Vertex>> adjacentVertices;

    public void addVertex(String label){
        adjacentVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void removeVertex(String label) {
        Vertex vertex = new Vertex(label);
        adjacentVertices.values().stream().forEach(e -> e.remove(vertex));
        adjacentVertices.remove(new Vertex(label));
    }

    public void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjacentVertices.get(v1).add(v2);
        adjacentVertices.get(v2).add(v1);
    }

    public void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjacentVertices.get(v1);
        List<Vertex> eV2 = adjacentVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }

    public Graph createGraph() {
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        return graph;
    }

    public List<Vertex> getAdjVertices(String label) {
        return adjacentVertices.get(new Vertex(label));
    }

    public void depthFirstTraversal(Graph graph, Vertex root){

        Stack<Vertex> stack = new Stack<>();
        stack.add(root);

        while(!stack.isEmpty()){

            Vertex currentVertex = stack.pop();
            System.out.println(currentVertex.getLabel());
            for(Vertex vertex : graph.getAdjVertices(currentVertex.getLabel())){
                stack.push(vertex);
            }

        }

    }
}
