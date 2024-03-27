package com.lazarin.practicing.leetcode.binarysearch.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-positive-integer-solution-for-a-given-equation/description/
public class FindPositiveIntegerSolutionForAGivenEquation {

    //approach 1 - brute force (linear search)
    //T:O(n^2) where N is 1000; S:O(1)
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int x = 1; x <= 1000; x++) {
            for(int y = 1; y <= 1000; y++){
                if(customfunction.f(x, y) == z){
                    answer.add(Arrays.asList(x, y));
                }
            }
        }
        return answer;
    }

    //approach 2 (optimal solution) - using binary search
    //T: O(nlog(n))
    //S O(N)
    public List<List<Integer>> findSolution_2(CustomFunction customfunction, int z) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int x = 1; x <= z; x++){
            int left = 1;
            int right = z;
            while(left <= right) {
                int y = left + (right - left) / 2;
                int val = customfunction.f(x, y);
                if(val == z){
                    answer.add(Arrays.asList(x, y));
                    break;
                } else if(val > z){
                   right = y - 1;
                } else {
                    left = y + 1;
                }
            }
        }
        return answer;
    }

    // This is the custom function interface.
     // You should not implement it, or speculate about its implementation
    class CustomFunction {

         // Returns f(x, y) for any given positive integers x and y.
         // Note that f(x, y) is increasing with respect to both x and y.
        // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
        public int f(int x, int y){
            return 0;
        }
    }
}
