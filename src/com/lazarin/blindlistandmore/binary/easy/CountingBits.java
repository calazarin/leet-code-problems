package com.lazarin.blindlistandmore.binary.easy;

//https://leetcode.com/problems/counting-bits/
public class CountingBits {

    public static void main(String args[]){
        /*Input: n = 2
        Output: [0,1,1]
        Explanation:
        0 --> 0
        1 --> 1
        2 --> 10*/


        /*Input: n = 5
        Output: [0,1,1,2,1,2]
        Explanation:
        0 --> 0
        1 --> 1
        2 --> 10
        3 --> 11
        4 --> 100
        5 --> 101*/
    }

    //O(n) time and space
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
}
