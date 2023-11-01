package com.lazarin.practicing.leetcode.dynamicprogramming.hard;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
public class BestTimeToBuyAndSellStockIII {

    //approach 1 - recursion - T: exponential S: O(N)
    public int maxProfit(int[] prices) {

        int index = 0;
        int buyOrSell = 1; //1 = buy; 0 = sell
        int cap = 2; //amount of transactions allowed
        return calc(index, buyOrSell, cap, prices);
    }

    private int calc(int index, int buy, int cap, int[] prices) {
        if (index == prices.length || cap == 0) return 0;

        if(buy == 1) {
            return Math.max(-prices[index] + calc(index + 1, 0, cap, prices),
                    0 + calc(index + 1, 1, cap, prices));
        }

        return Math.max(prices[index] + calc(index + 1, 1, cap - 1, prices),
                0 + calc(index + 1, 0, cap, prices));
    }

    //approach 2 - memoization - T: O(N * 2 * 3) ; S: O(N * 2 * 3)
    public int maxProfit_2(int[] prices) {

        /**
         * dp with 3 different states
         * index -> from 0 to n-1
         * buy -> 0 or 1
         * cap -> 0, 1 or 2
         */
        int[][][] dp = new int[prices.length][2][3];
        for(int i = 0 ; i < dp.length; i++){
            for(int j = 0; j <dp[i].length; j++){
                for(int h = 0; h < dp[i][j].length; h++){
                    dp[i][j][h] = -1;
                }
            }
        }

        int index = 0;
        int buyOrSell = 1; //1 = buy; 0 = sell
        int cap = 2; //amount of transactions allowed
        return calc_2(index, buyOrSell, cap, prices, dp);
    }

    private int calc_2(int index, int buy, int cap, int[] prices, int[][][] dp) {
        if (index == prices.length || cap == 0) return 0;

        if(dp[index][buy][cap] != -1){
            return dp[index][buy][cap];
        }

        if(buy == 1) {
            dp[index][buy][cap] = Math.max(-prices[index] + calc_2(index + 1, 0, cap, prices, dp),
                    0 + calc_2(index + 1, 1, cap, prices, dp));

            return dp[index][buy][cap];
        }

        dp[index][buy][cap] = Math.max(prices[index] + calc_2(index + 1, 1, cap - 1, prices, dp),
                0 + calc_2(index + 1, 0, cap, prices,dp));

        return dp[index][buy][cap];
    }

    //approach 2 - tabulation
    public int maxProfit_3(int[] prices) {

        int[][][] dp = new int[prices.length + 1][2][3];

        for(int ind = prices.length - 1; ind >=0; ind--){
            for(int buy = 0; buy <= 1; buy++){
                for(int cap = 1; cap <= 2; cap++){
                    if(buy == 1) {
                        dp[ind][buy][cap] = Math.max(-prices[ind] + dp[ind + 1][0][cap],
                                0 + dp[ind + 1][1][cap]);
                    } else {
                        dp[ind][buy][cap] = Math.max(prices[ind] +  dp[ind + 1][1][cap - 1],
                                0 + dp[ind + 1][0][cap]);
                    }
                }
            }
        }
        return dp[0][1][2];
    }
}
