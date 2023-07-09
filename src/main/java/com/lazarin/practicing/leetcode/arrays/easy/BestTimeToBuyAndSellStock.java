package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){

            int currentBuyPrice = prices[i];

            if(currentBuyPrice < minBuyPrice) {
                minBuyPrice = currentBuyPrice;
            }

            var profit = currentBuyPrice - minBuyPrice;
            if(profit > maxProfit) {
                maxProfit = profit;
            }

        }

        return maxProfit;
    }
}
