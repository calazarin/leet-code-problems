package com.lazarin.blindlistandmore.dynamicprogramming.medium;

//https://leetcode.com/problems/longest-common-subsequence/
public class LongestCommonSubsequence {

    public static void main(String args[]){
        /*Input: text1 = "abcde", text2 = "ace"
        Output: 3
        Explanation: The longest common subsequence is "ace" and its length is 3.*/
        System.out.println(longestCommonSubsequence("abcde", "ace"));


     /*   Input: text1 = "abc", text2 = "abc"
        Output: 3
        Explanation: The longest common subsequence is "abc" and its length is 3.*/
        System.out.println(longestCommonSubsequence("abc", "abc"));

        /*Input: text1 = "abc", text2 = "def"
        Output: 0
        Explanation: There is no such common subsequence, so the result is 0.*/
        System.out.println(longestCommonSubsequence("abc", "def"));

    }

    public static int longestCommonSubsequence(String text1, String text2) {

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

        /*for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(text1Arr[i - 1] == text2Arr[j - 1]){
                    dp[i][j] = 1 + dp[i-1][j - 1];
                }
            }
        }

        return dp[text1.length() + 1][text2.length() + 1];*/
    }
}
