package com.lazarin.learning.dynamicprogramming.memoization.numbers;

import java.util.HashMap;
import java.util.Map;

public class CamSumMain {

    public static void main(String args[]){
        var result1 = canSum(7, new int[]{2,3}, new HashMap<>());
        System.out.println(result1);
        var result2 = canSum(7, new int[]{5, 3, 4, 7}, new HashMap<>());
        System.out.println(result2);
        var result3 = canSum(8, new int[]{2,3,5}, new HashMap<>());
        System.out.println(result3);
        var result4 = canSum(7, new int[]{2, 4 }, new HashMap<>());
        System.out.println(result4);
        var result5 = canSum(300, new int[]{7, 14 }, new HashMap<>());
        System.out.println(result5);
    }

    public static boolean canSum(int target, int[] numbers, Map<Integer, Boolean> memo){
        if(memo.containsKey(target)) return memo.get(target);
        if(target == 0 ) return true;
        if(target < 0) return false;

        for(int number : numbers){
            var newTarget = target - number;
            if(canSum(newTarget, numbers, memo)){
                memo.put(newTarget, true);
                return true;
            }

        }
        memo.put(target, false);
        return false;
    }

}
