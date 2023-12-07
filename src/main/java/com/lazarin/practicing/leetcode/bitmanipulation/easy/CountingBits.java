package com.lazarin.practicing.leetcode.bitmanipulation.easy;

//https://leetcode.com/problems/counting-bits/
public class CountingBits {

    //approach 1 - DP - O(n) time and space
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        int offset = 1;
        for(int i = 1; i < n + 1; i++){
            if((offset * 2) == i){
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }

    //approach 2 - DP but different code - O(n) time and space
    public int[] countBits_2(int n) {
        int[] bitCounts = new int[n + 1];
        for(int i = 1; i <= n; i++){
            bitCounts[i] = bitCounts[i >> 1] + i % 2;
        }
        return bitCounts;
    }

}
