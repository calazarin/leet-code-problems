package com.lazarin.blindlistandmore.graph.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/course-schedule/
public class CourseSchedule {

    public static void main(String args[]){

        /* Input: numCourses = 4, prerequisites = [[0,1], [0,2], [0,3], [2,3]]
        Output: true*/
        System.out.println(canFinish2(4, new int[][]{{0,1}, {0,2}, {0,3}, {2,3}}));

       /* Input: numCourses = 2, prerequisites = [[1,0]]
        Output: true*/
        System.out.println(canFinish2(2, new int[][]{{1,0}}));


       /* Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
        Output: false*/
        System.out.println(canFinish2(2, new int[][]{{1,0}, {0,1}}));

    }

    public static boolean canFinish2(int numCourses, int[][] prerequisites) {

        //map each course to a pre req map
        HashMap<Integer, ArrayList<Integer>> preMap = new HashMap<>();
        for(int i = 0; i < numCourses; i++){
            preMap.put(i, new ArrayList<>());
        }


        for(int i = 0; i < prerequisites.length; i++){
                var course = prerequisites[i][0];
                var preReq = prerequisites[i][1];
                preMap.get(course).add(preReq);
        }

        //visitSet = all courses along the current DFS path
        HashSet<Integer> visitedSet = new HashSet<>();

        for(int course = 0; course < numCourses; course++){
            if(!dfs(course,visitedSet, preMap)){
                return false;
            }
        }
        return true;
    }

    private static boolean dfs(Integer course, HashSet<Integer> visitedSet, HashMap<Integer, ArrayList<Integer>> preMap){
        if(visitedSet.contains(course)){ //course already visited
             return false;
        }
        if(preMap.get(course).isEmpty()){ //course does not have any pre-requisite
            return true;
        }
        visitedSet.add(course);
        for(Integer preReq : preMap.get(course)){
            if (!dfs(preReq,visitedSet, preMap)){
                return false;
            }
        }
        visitedSet.remove(course);
        preMap.put(course, new ArrayList<>()); // set a empty pre-requisite map as this course can be done
        return true;
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        HashMap<Integer, ArrayList<Integer>> verticesAndEdges = new HashMap<>();

        for(int i = 0; i < prerequisites.length; i++){

            for(int j = 0; j < prerequisites[i].length; j++){

                if(!verticesAndEdges.containsKey(prerequisites[i][j])){
                    verticesAndEdges.put(prerequisites[i][j], new ArrayList<>());
                }

                ArrayList<Integer> edges = verticesAndEdges.get(prerequisites[i][j]);
                if(!edges.contains(prerequisites[i][j])){
                    edges.add(prerequisites[i][j]);
                    verticesAndEdges.put(prerequisites[i][j], edges);
                }

            }
        }

        return false;
    }
}
