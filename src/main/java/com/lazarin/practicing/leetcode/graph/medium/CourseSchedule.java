package com.lazarin.practicing.leetcode.graph.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/course-schedule/
public class CourseSchedule {
    //approach 1
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        //map each course to a pre req map
        HashMap<Integer, ArrayList<Integer>> preMap = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            preMap.put(i, new ArrayList<>());
        }


        for (int i = 0; i < prerequisites.length; i++) {
            var course = prerequisites[i][0];
            var preReq = prerequisites[i][1];
            preMap.get(course).add(preReq);
        }

        //visitSet = all courses along the current DFS path
        HashSet<Integer> visitedSet = new HashSet<>();

        for (int course = 0; course < numCourses; course++) {
            if (!dfs(course, visitedSet, preMap)) {
                return false;
            }
        }
        return true;
    }

    private static boolean dfs(Integer course, HashSet<Integer> visitedSet, HashMap<Integer, ArrayList<Integer>> preMap) {
        if (visitedSet.contains(course)) { //course already visited
            return false;
        }
        if (preMap.get(course).isEmpty()) { //course does not have any pre-requisite
            return true;
        }
        visitedSet.add(course);
        for (Integer preReq : preMap.get(course)) {
            if (!dfs(preReq, visitedSet, preMap)) {
                return false;
            }
        }
        visitedSet.remove(course);
        preMap.put(course, new ArrayList<>()); // set a empty pre-requisite map as this course can be done
        return true;
    }
}
