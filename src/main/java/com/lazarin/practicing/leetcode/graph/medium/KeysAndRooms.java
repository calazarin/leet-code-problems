package com.lazarin.practicing.leetcode.graph.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/keys-and-rooms/
public class KeysAndRooms {

    //T:O (N+M) where N is the amount of rooms and M amount of keys
    //S:O(N)
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int roomSize = rooms.size();
        HashSet<Integer> visited = checkKeys(rooms, 0,  new HashSet<>());
        int visitedSize = visited.size();
        return roomSize == visitedSize;
    }

    private HashSet<Integer> checkKeys(List<List<Integer>> rooms, int roomNumber, HashSet<Integer> visited){

        visited.add(roomNumber);

        List<Integer> keys = rooms.get(roomNumber);

        for (int keyIndex = 0; keyIndex < keys.size(); keyIndex++){

            Integer currentKey = keys.get(keyIndex);
            if(!visited.contains(currentKey)){
                visited = checkKeys(rooms, currentKey, visited);
            }
        }

        return visited;
    }

    //approach 2
    public boolean canVisitAllRooms2(List<List<Integer>> rooms) {
        HashSet<Integer> visited = new HashSet<>();
        visited.add(0);

        Stack<Integer> stack = new Stack<>();
        stack.add(0);

        while(!stack.isEmpty()){

            List<Integer> keys = rooms.get(stack.pop());
            for(int key: keys){
                if(!visited.contains(key)){
                    visited.add(key);
                    stack.add(key);
                }
            }
        }
        return visited.size() == rooms.size();
    }
}
