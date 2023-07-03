package com.lazarin.learning.leetcode.dynamicprogramming.tabulation;

import java.util.Arrays;

public class Fibonnaci {

    public static void main(String ...args){
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
        System.out.println(fib(50));
    }

    public static long fib(int n){
        long[] tabArr = new long[n + 1];
        tabArr = Arrays.stream(tabArr).map(x -> 0).toArray();
        tabArr[1] = 1;
        for(int i = 0; i < n; i++){
            tabArr[i + 1] += tabArr[i];
            if(i + 2 <= n){
                tabArr[i + 2] += tabArr[i];
            }
        }
        return tabArr[n];
    }

}
