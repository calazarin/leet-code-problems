package com.lazarin.practicing.leetcode.dynamicprogramming.easy;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {

    //approach 1 - iterative - T: O(N); S; O(1)
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){

            int cost = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, cost);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
}
