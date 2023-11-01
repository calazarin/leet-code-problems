package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

//https://leetcode.com/problems/unique-paths/
public class UniquePaths {

    //approach 1 - recursion - T: 2 ^(n * m); S(n * m)
    public int uniquePaths_1(int m, int n) {
        return find(0, 0, m, n);
    }

    private int find(int i, int j, int m, int n){
        //base cases
        if(i == m - 1 && j == n - 1){
            return 1;
        }

        if(i < 0 || j < 0 || j >=n || i >= m){
            return 0;
        }
        //do all stufss
        int down = find(i + 1, j, m, n);
        int right = find(i, j + 1, m, n);

        return down + right;
    }

    //approach 2 - DP - memoization - T: (n * m); S(n * m)
    public int uniquePaths_2(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }

        return find_2(0, 0, m, n, dp);
    }

    private int find_2(int i, int j, int m, int n, int[][] dp){
        //base cases
        if(i == m - 1 && j == n - 1){
            return 1;
        }

        if(i < 0 || j < 0 || j >=n || i >= m){
            return 0;
        }
        //do all stufss
        int down = find_2(i + 1, j, m, n, dp);
        int right = find_2(i, j + 1, m, n, dp);

        dp[i][j] = down + right;

        return dp[i][j];
    }


    //approach 3 - DP - tabulation
    public int uniquePaths_3(int m, int n) {
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else {
                    int up = 0, left = 0;
                    if(i > 0) up = dp[i - 1][j];
                    if(j > 0) left = dp[i][j - 1];
                    dp[i][j] = up + left;
                }

            }
        }

        return dp[m - 1][n - 1];
    }

}
