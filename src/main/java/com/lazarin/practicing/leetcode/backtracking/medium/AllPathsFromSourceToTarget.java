package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/all-paths-from-source-to-target/
public class AllPathsFromSourceToTarget {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> allAnswers = new ArrayList<>();
        dfs(0, graph, new ArrayList<>(), allAnswers);
        return allAnswers;
    }

    public void dfs(int index, int[][] graph, List<Integer> partialAnswer, List<List<Integer>> allAnswers){

        //bound function
        if(index == graph.length - 1){
            partialAnswer.add(index);
            allAnswers.add(new ArrayList<>(partialAnswer));
            return;
        }

        partialAnswer.add(index);

        //choices
        for(int i = 0; i < graph[index].length; i++){
            dfs(graph[index][i], graph, partialAnswer, allAnswers);
            partialAnswer.remove(partialAnswer.size() - 1);
        }

    }
}
