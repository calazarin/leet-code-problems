package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import java.util.LinkedList;

//https://leetcode.com/problems/unique-paths/
public class UniquePaths {

    public int uniquePaths(int m, int n) {

        int possibilities = 0;

        LinkedList<Position> queue = new LinkedList<>();
        queue.push(new Position(0, 0));
        while (!queue.isEmpty()){

            Position current = queue.pop();
            int x = current.getX();
            int y = current.getY();

            if(x == n - 1 && y == m -1){
                //final destination
                possibilities++;

            } else {
                if(x + 1 < n){
                    queue.push(new Position(x+1, y));
                }
                if(y + 1 < m){
                    queue.push(new Position(x, y+1));
                }
            }
        }
        return possibilities;
    }

    //O(n*m)
    public int uniquePathsOptmized(int m, int n) {
        int[][] dp = new int[n][m];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[i].length; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];
    }
}
