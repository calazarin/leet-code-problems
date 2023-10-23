package com.lazarin.practicing.leetcode.dynamicprogramming.easy;

import java.util.Arrays;

//https://leetcode.com/problems/fibonacci-number/
public class FibonacciNumber {

    //approach 1 - recursion - T:O(N); S:O(N)
    public int fib(int n) {
        return f(n);
    }

    public int f(int n){
        if(n < 0) {
            return 0;
        }
        if(n <= 1) {
            return n;
        }
        return f(n - 1) + f(n - 2);
    }

    //approach 2 - dp (memoization) - T:O(N); S:O(N)
    public int fib_2(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return f_2(n, dp);
    }

    public int f_2(int n, int[] dp){
        if(n < 0) {
            return 0;
        }
        if(n <= 1) {
            return n;
        }
        if(dp[n] != -1) return dp[n];
        dp[n] = f_2(n - 1, dp) + f_2(n - 2, dp);
        return dp[n];
    }

    //approach 3 - dp (tabulation) - T:O(N); S:O(N)
    public int fib_3(int n) {

        if(n < 1) return n;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    //approach 4 - dp (tabulation) with space optimization - T:O(N); S:O(1)
    public int fib_4(int n) {

        if(n < 1) return n;

        int prev2 = 0;
        int prev = 1;
        for(int i = 2; i <= n; i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
