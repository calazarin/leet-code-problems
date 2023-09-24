package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

//https://leetcode.com/problems/longest-common-subsequence/
public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for(int row = 0; row <= text1.length(); row++){
            for(int column = 0; column <= text2.length(); column++){

                if(column == 0 || row == 0){
                    dp[row][column] = 0;
                } else if(text1.charAt(row -1) == text2.charAt(column -1)){
                    dp[row][column] = 1 + dp[row - 1][column - 1];
                } else {
                    dp[row][column] = Math.max(dp[row -1][column], dp[row][column - 1]);
                }

            }
        }
        return dp[text1.length()][text2.length()];
    }
}
