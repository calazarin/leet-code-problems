package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/unique-number-of-occurrences
public class UniqueNumberOfOccurrences {

    public static void main(String args[]){

        UniqueNumberOfOccurrences solution =
                new UniqueNumberOfOccurrences();

      /*  Input: arr = [1,2,2,1,1,3]
        Output: true*/
        System.out.println(solution.uniqueOccurrences(new int[]{1,2,2,1,1,3}));

       /* Input: arr = [1,2]
        Output: false*/
        System.out.println(solution.uniqueOccurrences(new int[]{1,2}));

       /* Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
        Output: true*/
        System.out.println(solution.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }

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
