package com.lazarin.practicing.leetcode.graph.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/evaluate-division/
public class EvaluateDivision {

    //approach 1 - using a graph + DFS
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        double[] answers = new double[queries.size()];

        HashMap<String, HashMap<String, Double>> graph = buildGraph(equations, values);

        for(int i = 0; i < queries.size(); i++){

            List<String> query = queries.get(i);

            String dividend = query.get(0);
            String divisor = query.get(1);

            if(!graph.containsKey(dividend) || !graph.containsKey(divisor)){
                answers[i] = -1.0;
            } else {

                HashSet<String> visited = new HashSet<>();
                double[] answer = {-1.0d};
                double resultSoFar = 1.0d;

                dfs(dividend, divisor, graph, visited, answer, resultSoFar);
                answers[i] = answer[0];
            }
        }
        return answers;
    }

    private void dfs(String source, String destination, HashMap<String, HashMap<String, Double>> graph,
                     HashSet<String> visited, double[] answer, double resultSoFar) {

        if(visited.contains(source)){
            return;
        }

        visited.add(source);
        if(source.equals(destination)){
            answer[0] = resultSoFar;
        }

        for(Map.Entry<String, Double> entry: graph.get(source).entrySet()){
            String neighbor = entry.getKey();
            double value = entry.getValue();
            dfs(neighbor, destination, graph, visited, answer, resultSoFar * value);
        }
    }

    private HashMap<String, HashMap<String, Double>> buildGraph(List<List<String>> equations, double[] values) {

        HashMap<String, HashMap<String, Double>> graph = new HashMap<>();

        for(int i = 0; i < equations.size(); i++){

            List<String> equation = equations.get(i);
            String dividend = equation.get(0);
            String divisor = equation.get(1);

            double value = values[i];

            graph.putIfAbsent(dividend, new HashMap<>());
            graph.putIfAbsent(divisor, new HashMap<>());

            graph.get(dividend).put(divisor, value);
            graph.get(divisor).put(dividend, 1.0 / value);
        }

        return graph;
    }
}
