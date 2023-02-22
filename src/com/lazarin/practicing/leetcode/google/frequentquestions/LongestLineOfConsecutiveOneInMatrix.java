package com.lazarin.googlequestions.interviewprocess;

//https://leetcode.com/problems/longest-line-of-consecutive-one-in-matrix/
public class LongestLineOfConsecutiveOneInMatrix {

    public static void main(String args[]){

        /*Input: mat = [[0,1,1,0],[0,1,1,0],[0,0,0,1]]
        Output: 3*/
        System.out.println(longestLine2(new int[][]{ {0,1,1,0},{0,1,1,0},{0,0,0,1} }));

       /* Input: mat = [[1,1,1,1],[0,1,1,0],[0,0,0,1]]
        Output: 4*/
        System.out.println(longestLine(new int[][]{ {1,1,1,1}, {0,1,1,0},{0,0,0,1} }));
    }

    //dp solution
    public static int longestLine(int[][] mat) {

        //best way could be 4 pass to the matrix horizontal, vertical diagonal and anti-diagonal
        int[][][] dp = new int[4][mat.length][mat[0].length];

        int answer = 0;
        for(int i=0;i<mat.length;i++) {
            for (int j = 0; j < mat[0].length; j++) {

                if(mat[i][j] == 1) {
                    dp[0][i][j] = 1;
                    dp[1][i][j] = 1;
                    dp[2][i][j] = 1;
                    dp[3][i][j] = 1;

                    if(i-1 >=0 && mat[i-1][j] == 1){
                        dp[0][i][j] = 1+dp[0][i-1][j];
                    }
                    if(j-1 >=0 && mat[i][j-1] == 1){
                        dp[1][i][j] = 1+dp[1][i][j-1];
                    }
                    if(j-1 >=0 && i-1>=0 && mat[i-1][j-1] == 1){
                        dp[2][i][j] = 1+dp[2][i-1][j-1];
                    }
                    if(j+1 < mat[0].length && i-1>=0 && mat[i-1][j+1] == 1){
                        dp[3][i][j] = 1+dp[3][i-1][j+1];
                    }
                    answer = Math.max(dp[0][i][j] , answer);
                    answer = Math.max(dp[1][i][j] , answer);
                    answer = Math.max(dp[2][i][j] , answer);
                    answer = Math.max(dp[3][i][j] , answer);
                }

            }
        }

        return answer;

    }

    //Brute force solution
    //Time complexity : O(mn)O(mn). We traverse along the entire matrix 4 times.
    //Space complexity : O(1)O(1). Constant space is used.
    public static int longestLine2(int[][] M) {
        if (M.length == 0) return 0;
        int ones = 0;
        // horizontal
        for (int i = 0; i < M.length; i++) {
            int count = 0;
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == 1) {
                    count++;
                    ones = Math.max(ones, count);
                } else count = 0;
            }
        }
        // vertical
        for (int i = 0; i < M[0].length; i++) {
            int count = 0;
            for (int j = 0; j < M.length; j++) {
                if (M[j][i] == 1) {
                    count++;
                    ones = Math.max(ones, count);
                } else count = 0;
            }
        }
        // upper diagonal
        for (int i = 0; i < M[0].length || i < M.length; i++) {
            int count = 0;
            for (int x = 0, y = i; x < M.length && y < M[0].length; x++, y++) {
                if (M[x][y] == 1) {
                    count++;
                    ones = Math.max(ones, count);
                } else count = 0;
            }
        }
        // lower diagonal
        for (int i = 0; i < M[0].length || i < M.length; i++) {
            int count = 0;
            for (int x = i, y = 0; x < M.length && y < M[0].length; x++, y++) {
                if (M[x][y] == 1) {
                    count++;
                    ones = Math.max(ones, count);
                } else count = 0;
            }
        }
        // upper anti-diagonal
        for (int i = 0; i < M[0].length || i < M.length; i++) {
            int count = 0;
            for (int x = 0, y = M[0].length - i - 1; x < M.length && y >= 0; x++, y--) {
                if (M[x][y] == 1) {
                    count++;
                    ones = Math.max(ones, count);
                } else count = 0;
            }
        }
        // lower anti-diagonal
        for (int i = 0; i < M[0].length || i < M.length; i++) {
            int count = 0;
            for (int x = i, y = M[0].length - 1; x < M.length && y >= 0; x++, y--) {
                // System.out.println(x+" "+y);
                if (M[x][y] == 1) {
                    count++;
                    ones = Math.max(ones, count);
                } else count = 0;
            }
        }
        return ones;
    }

}
