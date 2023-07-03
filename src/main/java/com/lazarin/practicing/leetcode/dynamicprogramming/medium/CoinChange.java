package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import java.util.Arrays;

public class CoinChange {

    // 322. https://leetcode.com/problems/coin-change/
    public static void main(String args[]){

       /* Input: coins = [1,2,5], amount = 11
        Output: 3
        Explanation: 11 = 5 + 5 + 1*/
        System.out.println(coinChange(new int[]{1,2,5}, 11));

       /* Input: coins = [2], amount = 3
        Output: -1*/
        System.out.println(coinChange(new int[]{2}, 3));

       /* Input: coins = [1], amount = 0
        Output: 0*/
       System.out.println(coinChange(new int[]{1}, 0));

        /*
        Input: coins = [2,3]
        Amount = 5
        Output: 2
         */
        System.out.println(coinChange(new int[]{2,3}, 5));
    }

    public static int coinChange(int[] coins, int amount){
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); //fill up arrays with an invalid value
        dp[0] = 0;
        for(int i = 0; i <= amount; i++){

            for(int j = 0; j < coins.length; j++){
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }else{
                    break;
                }
            }

        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    /*public static int coinChange(int[] coins, int amount) {
        return coinChangeMemo(coins,amount, new HashMap<>());
    }

    private static int coinChangeMemo(int[] coins, int amount, HashMap<Integer, Integer> memo){

        if(memo.get(amount) != null) return memo.get(amount);
        if(amount < 0)  return -1;
        if(amount == 0) return 0;

        int minValue = Integer.MAX_VALUE;
        for(Integer coin : coins) {
            var newAmount = amount - coin;

            var result = coinChange(coins, newAmount);

            if(result >= 0) {
                result++;
                if(result < minValue) {
                    minValue = result;
                }
            }
        }
        var returningVal = minValue == Integer.MAX_VALUE ? -1 : minValue;
        memo.put(amount,returningVal);
        return returningVal;
    }*/
}
