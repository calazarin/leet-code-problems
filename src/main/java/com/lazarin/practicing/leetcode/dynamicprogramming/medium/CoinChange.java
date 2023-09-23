package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/coin-change/
public class CoinChange {

    //approach 1
    public int coinChange(int[] coins, int amount){
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

    //approach 2
    public int coinChange2(int[] coins, int amount) {
        return coinChangeMemo(coins,amount, new HashMap<>());
    }

    private int coinChangeMemo(int[] coins, int amount, HashMap<Integer, Integer> memo){

        if(memo.get(amount) != null) return memo.get(amount);
        if(amount < 0)  return -1;
        if(amount == 0) return 0;

        int minValue = Integer.MAX_VALUE;
        for(Integer coin : coins) {
            var newAmount = amount - coin;

            var result = coinChange2(coins, newAmount);

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
    }
}
