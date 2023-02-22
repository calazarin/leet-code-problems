package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {

    public static void main(String args[]){

        var result = maxProfit(new int[]{ 7,1,5,3,6,4 });
        System.out.println(result);

        var result2 = maxProfit(new int[]{ 7,6,4,3,1 });
        System.out.println(result2);
    }

    public static int maxProfit(int[] prices) {

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
