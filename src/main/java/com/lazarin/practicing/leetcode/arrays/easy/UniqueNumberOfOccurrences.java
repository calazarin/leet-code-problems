package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/unique-number-of-occurrences
public class UniqueNumberOfOccurrences {

    //T: O(N)
    //S: O(N)
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : arr) { //O(N)
            map.put(n, map.getOrDefault(n, 0) + 1); //O(1)
        }
        Set<Integer> occur = new HashSet<>();
        for(Integer v: map.values()){ //O(N)
            if(!occur.add(v)){
                return false;
            }
        }
        return true;
    }

    //T: O(N)
    //S: O(N)
    public boolean uniqueOccurrences2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return new HashSet<>(map.values()).size() == map.size();
    }
}
