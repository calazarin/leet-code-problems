package com.lazarin.practicing.leetcode.dynamicprogramming.easy;

//https://leetcode.com/problems/n-th-tribonacci-number
public class NthTribonacciNumber {

    //approach 1 - brute force
    //T:O(n)
    //S:O(n)
    public int tribonacci(int n) {

        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;

        int[] tfib = new int[n + 1];
        tfib[0] = 0;
        tfib[1] = 1;
        tfib[2] = 1;

        for(int i = 3; i <= n; i++){

            tfib[i] = tfib[i - 1] + tfib[i - 2] + tfib[i -3];
        }

        return tfib[n];

    }
}
