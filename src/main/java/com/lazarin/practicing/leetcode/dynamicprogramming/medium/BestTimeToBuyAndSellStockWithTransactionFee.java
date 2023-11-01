package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee
public class BestTimeToBuyAndSellStockWithTransactionFee {

    //approach 1 - recursion - T: 0(2^n); S: O(N)
    public int maxProfit(int[] prices, int fee) {
        return dfs(0, 1, prices, fee);
    }

    private int dfs(int day, int buy, int[] prices, int fee){

        if(day >= prices.length){
            return 0;
        }

        if(buy == 1){
            return Math.max(-prices[day] + dfs(day + 1, 0, prices, fee),
                    0 + dfs(day + 1, 1, prices, fee));
        }

        return Math.max(prices[day] - fee + dfs(day + 1, 1, prices, fee),
                0 + dfs(day + 1, 0, prices, fee));

    }

    //approach 2 - memoization - T: O(n*m); S: O(n*m)
    public int maxProfit_2(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[i].length; j++){
                dp[i][j] = -1;
            }
        }

        return dfs_2(0, 1, prices, fee, dp);
    }

    public int dfs_2(int day, int buy, int[] prices, int fee, int[][] dp){

        if(day >= prices.length){
            return 0;
        }

        if(dp[day][buy] != -1) {
            return dp[day][buy];
        }

        if(buy == 1){
            dp[day][buy] = Math.max(-prices[day] + dfs_2(day + 1, 0, prices, fee, dp),
                    0 + dfs_2(day + 1, 1, prices, fee, dp));
            return dp[day][buy];
        }
        dp[day][buy] = Math.max(prices[day] - fee + dfs_2(day + 1, 1, prices, fee, dp),
                0 + dfs_2(day + 1, 0, prices, fee, dp));
        return dp[day][buy];
    }

    //approach 3 - tabulation (bottom up approach) - T: O(n*m); S: O(n*m)
    public int maxProfit_3(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n + 1][2];

        for(int day = n - 1; day >= 0; day--){
            for(int buy = 0; buy <= 1; buy++){
                if(buy == 1) {
                    dp[day][buy] = Math.max(-prices[day] + dp[day + 1][0], 0 + dp[day + 1][1]);
                } else {
                    dp[day][buy] = Math.max(prices[day] - fee + dp[day + 1][1],
                            0 + dp[day + 1][0]);
                }
            }
        }
        return dp[0][1];
    }
}
