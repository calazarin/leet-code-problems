package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
public class BestTimeToBuyAndSellStockWithCooldown {

    //approach 1 - recursion - T: O(2^N); S: O(N)
    public int maxProfit(int[] prices) {
        //1 - buy; 0 - not buy
        return dfs(0, 1, prices);
    }

    private int dfs(int day, int buy, int[] prices){
        if(day >= prices.length) {
            return 0;
        }

        if(buy == 1){
            int profit = Math.max(-prices[day] + dfs(day + 1, 0, prices),
                    0 + dfs(day + 1, 1, prices));
            return profit;
        }
        int profit = Math.max(prices[day] + dfs(day + 2, 1, prices),
                0 + dfs(day + 1, 0, prices));
        return profit;
    }

    //approach 2 - memoization - T: O(N); S: O(N)
    public int maxProfit_2(int[] prices) {
        int days = prices.length;
        int[][] dp = new int[days][2];

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[i].length; j++){
                dp[i][j] = -1;
            }
        }

        //1 - buy; 0 - not buy
        return dfs_2(0, 1, prices, dp);
    }

    private int dfs_2(int day, int buy, int[] prices, int[][] dp){
        if(day >= prices.length) {
            return 0;
        }

        if(dp[day][buy] != -1){
            return dp[day][buy];
        }

        if(buy == 1){

            int profit = Math.max(-prices[day] + dfs_2(day + 1, 0, prices, dp),
                    0 + dfs_2(day + 1, 1, prices, dp));

            dp[day][buy] = profit;
            return profit;
        }
        int profit = Math.max(prices[day] + dfs_2(day + 2, 1, prices, dp),
                0 + dfs_2(day + 1, 0, prices, dp));

        dp[day][buy] = profit;
        return profit;
    }

    //approach 3 - tabulation (bottom up dp) - T: O(N); S: O(N)
    public int maxProfit_3(int[] prices) {
        int days = prices.length;

        int[][] dp = new int[days + 2][2];

        for(int day = days - 1; day >= 0; day--){

            for(int buy = 0; buy <= 1; buy++){

                    if(buy == 1) {
                        dp[day][buy] = Math.max(-prices[day] + dp[day + 1][0], 0 + dp[day + 1][1]);
                    } else {
                        dp[day][buy] = Math.max(prices[day] + dp[day + 2][1],
                                0 + dp[day + 1][0]);
                    }
                }

        }
        //answer will be at day with index 0 and state as buying (1)
        return dp[0][1];
    }
}
