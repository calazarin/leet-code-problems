package com.lazarin.learning.leetcode.dynamicprogramming.memoization.numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BestSumMan {

    public static void main(String args[]){

        var result1 = shortestSum(7, new int[]{5, 3, 4, 7}, new HashMap<>());
        System.out.println(result1);
        var result2 = shortestSum(8, new int[]{2,3,5}, new HashMap<>());
        System.out.println(result2);
        var result3 = shortestSum(8, new int[]{1,4,5}, new HashMap<>());
        System.out.println(result3);
       var result4 = shortestSum(100, new int[]{1,2,5,25}, new HashMap<>());
       System.out.println(result4);

    }

    public static List<Integer> shortestSum(int targetSum, int[] numbers, HashMap<Integer, List> memo){

        if(memo.containsKey(targetSum)) return memo.get(targetSum);
        if(targetSum == 0) return new ArrayList<>();
        if(targetSum < 0) return null;

        List<Integer> shortestCombination = null;
        for(int number : numbers) {
            var remainder = targetSum - number;
            var remainderCombination = shortestSum(remainder, numbers, memo);
            if (remainderCombination != null) {
//                remainderCombination.add(number);

                var newResult = new ArrayList<Integer>();
                newResult.add(number);
                newResult.addAll(remainderCombination);

                if(shortestCombination == null || shortestCombination.size() > newResult.size()) {
                    shortestCombination = newResult;
                }
            }
        }

        memo.put(targetSum, shortestCombination);
        return shortestCombination;
    }

}
