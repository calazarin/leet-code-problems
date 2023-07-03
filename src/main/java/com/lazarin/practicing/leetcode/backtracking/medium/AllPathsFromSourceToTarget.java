package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/all-paths-from-source-to-target/
public class AllPathsFromSourceToTarget {

    public static void main(String args[]){

        AllPathsFromSourceToTarget solution = new AllPathsFromSourceToTarget();
     /*   Input: graph = [[1,2],[3],[3],[]]
        Output: [[0,1,3],[0,2,3]]
        Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.*/
        var answer = solution.allPathsSourceTarget(new int[][]{{1,2}, {3}, {3}, {}});
        answer.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%s,", p));
            System.out.print("\n");
        });

       /* Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
        Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]*/
        var answer2 = solution.allPathsSourceTarget(new int[][]{{4,3,1}, {3,2,4}, {3}, {4},{}});
        answer2.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%s,", p));
            System.out.print("\n");
        });
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> allAnswers = new ArrayList<>();
        dfs(0, graph, new ArrayList<>(), allAnswers);
        return allAnswers;
    }

    //index = 0
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
             //how to add the element here?
            dfs(graph[index][i], graph, partialAnswer, allAnswers);
            partialAnswer.remove(partialAnswer.size() - 1);
        }

    }
}
