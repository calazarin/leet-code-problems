package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
public class BestTimeToBuyAndSellStockII {

    //approach 1 - recursion - T:O(2^N) - S: O(N)
    public int maxProfit(int[] prices) {
        return calc(0, true, prices);
    }

    private int calc(int index, boolean buy,int[] prices){
        if(index == prices.length) {
            return 0;
        }
        int profit;
        if(buy){
            profit = Math.max(-prices[index] + calc(index + 1, false, prices),
                        0 + calc(index + 1, true, prices));
        } else {
            profit = Math.max(prices[index] + calc(index + 1, true, prices),
                      0 + calc(index + 1, false, prices));
        }
        return profit;
    }

    //approach 2 - memoization -  T: O(n*2) - S: O(n*2)
    public int maxProfit_2(int[] prices) {
        int[][] dp = new int[prices.length][2];

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[i].length; j++){
                dp[i][j] = -1;
            }
        }

        //1-buy; 2-sell
        return calc_2(0, 1, prices, dp);
    }

    private int calc_2(int index, int buy,int[] prices, int[][] dp){
        if(index == prices.length) {
            return 0;
        }

        if(dp[index][buy] != -1) {
            return dp[index][buy];
        }

        int profit;
        if(buy == 1){
            profit = Math.max(-prices[index] + calc_2(index + 1, 0, prices, dp),
                    0 + calc_2(index + 1, 1, prices, dp));
        } else {
            profit = Math.max(prices[index] + calc_2(index + 1, 1, prices, dp),
                    0 + calc_2(index + 1, 0, prices, dp));
        }
        dp[index][buy] = profit;
        return profit;
    }

    //approach 3 - tabulation -
    public int maxProfit_3(int[] prices) {

        int n = prices.length;

        int[][] dp = new int[n + 1][2];
        dp[n][0] = 0;
        dp[n][1] = 0;

        for(int index = n - 1; index >= 0; index--){
            for(int buy = 0; buy <= 1; buy++){

                int profit;
                if(buy == 1){
                    profit = Math.max(-prices[index] + dp[index + 1][0],
                            0 + dp[index + 1][1]);
                } else {
                    profit = Math.max(prices[index] + dp[index + 1][1],
                            0 + dp[index + 1][0]);
                }
                dp[index][buy] = profit;

            }
        }
        return dp[0][1];
    }

    //approach 4 - T:O(N); S: O(1)
    public int maxProfit_4(int[] prices) {
        int profit = 0;

        for(int i  = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}
