package com.lazarin.practicing.leetcode.dynamicprogramming.hard;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
public class BestTimeToBuyAndSellStockIV {

    //approach 1 - recursion - T: O(2^n); S:O(N)
    public int maxProfit(int k, int[] prices) {
        return dfs(0, 1, k, prices);
    }

    private int dfs(int day, int buy, int k, int[] prices){

        if(day >= prices.length || k <= 0) {
            return 0;
        }

        if(buy == 1) {
            return Math.max(-prices[day] + dfs(day + 1, 0, k, prices),
                    0 + dfs(day + 1, 1, k, prices));
        }
        return Math.max(prices[day] + dfs(day + 1, 1, k - 1, prices),
                0 + dfs(day + 1, 0, k, prices));
    }

    //approach 2 - memoization - T: O(N*M*K); S: O(N)
    public int maxProfit_2(int k, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][k + 1];

        for(int p = 0; p < dp.length; p++){
            for(int b = 0; b < dp[p].length; b++){
                for(int x = 0; x < dp[p][b].length; x++){
                    dp[p][b][x] = -1;
                }
            }
        }

        return dfs_2(0, 1, k, prices, dp);
    }

    private int dfs_2(int day, int buy, int k, int[] prices, int[][][] dp){

        if(day >= prices.length || k <= 0) {
            return 0;
        }

        if(dp[day][buy][k] != -1){
            return dp[day][buy][k];
        }

        if(buy == 1) {

            dp[day][buy][k] = Math.max(-prices[day] + dfs_2(day + 1, 0, k, prices, dp),
                    0 + dfs_2(day + 1, 1, k, prices, dp));

            return dp[day][buy][k];

        }

        dp[day][buy][k] = Math.max(prices[day] + dfs_2(day + 1, 1, k - 1, prices, dp),
                0 + dfs_2(day + 1, 0, k, prices, dp));

        return dp[day][buy][k];
    }

    //approach 3 - tabulation (bottom up)
    public int maxProfit_3(int k, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][k + 1];

        for(int day = n - 1; day >=0; day--){
            for(int buy = 0; buy <= 1; buy++) {

                for(int t = 1; t <= k; t++){
                    if (buy == 1) {
                        dp[day][buy][t] = Math.max(-prices[day] + dp[day + 1][0][t],
                                0 + dp[day + 1][1][t]);
                    } else {
                        dp[day][buy][t] = Math.max(prices[day] + dp[day + 1][1][t - 1],
                                0 + dp[day + 1][0][t]);
                    }
                }
            }
        }
        return dp[0][1][k];
    }
}
