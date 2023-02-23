package com.lazarin.learning.leetcode.recursion.divideandconquer;

import java.util.HashMap;
import java.util.Map;

public class Fibonnaci {

    public static void main(String args[]){

        Map<Integer, Integer> memoizedCache = new HashMap<>();
        memoizedCache.put(1,1);
        memoizedCache.put(0, 1);



    }

    public static int fib(int n, Map<Integer, Integer> memoizedCache){

        if(memoizedCache.containsKey(n)){
            return memoizedCache.get(n);
        }

        int result = fib(n - 1, memoizedCache) + fib(n - 2, memoizedCache);
        memoizedCache.put(n, result);
        return result;
    }




}
