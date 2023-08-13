package com.lazarin.practicing.leetcode.graph.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/course-schedule-ii/description/
public class CourseSchedule2 {

    //approach 1 - DFS
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        //build adjacency list of prerequisites
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for(int i = 0; i < numCourses; i++){
            adjList.put(i, new ArrayList<>());
        }

        for(int[] prereqs : prerequisites){
            adjList.get(prereqs[0]).add(prereqs[1]);
        }

        //a course has 3 possible states
        //visited -> course has been added to output
        //visiting -> course not added to output but added to cycle
        //unvisited -> course not added to output or cycle

        List<Integer> output = new ArrayList<>();
        Set<Integer> visited = new HashSet<>(), cycle = new HashSet<>();
        for(int i = 0; i < numCourses; i++){
            if(!dsf(adjList, output, i, visited, cycle)){
                //we found a cycle!
                return new int[0];
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }

    private boolean dsf(Map<Integer, List<Integer>> adjList, List<Integer> output,
                        Integer course, Set<Integer> visited, Set<Integer> cycle){
        if(cycle.contains(course)){
            return false;
        }
        if(visited.contains(course)){
            return true;
        }
        cycle.add(course);
        for(Integer preReq : adjList.get(course)){
            if(!dsf(adjList, output, preReq, visited, cycle)){
                return false;
            }
        }
        cycle.remove(course);
        visited.add(course);
        output.add(course);
        return true;
    }
}
