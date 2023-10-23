package com.lazarin.practicing.leetcode.dynamicprogramming.easy;

import java.util.Arrays;

//https://leetcode.com/problems/divisor-game/
public class DivisorGame {

    //approach 1 - recursive
    public boolean divisorGame(int n) {
        return help(n) == 0 ? false : true;
    }

    public int help(int n){
        if(n == 1){
            return 0;
        } else {
            for(int i = 1; i < n; i++){
                if(n % i == 0){
                    if(help(n - i) == 0) {
                        return  1;
                    }
                }
            }
            return 0;
        }
    }

    //approach 2 - dp
    public boolean divisorGame_2(int n) {

        int[] dp = new int[1001];
        Arrays.fill(dp, -1);

        return help_2(n, dp) == 0 ? false : true;
    }

    public int help_2(int n, int[] dp){
        if(n == 1){
            return 0;
        }

        if(dp[n] != -1) return dp[n];

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                if(help(n - i) == 0) {
                    dp[n] = 1;
                    return  dp[n];
                }
            }
        }
        dp[n] = 0;
        return dp[n];
    }

   /* public boolean divisorGame(int n) {
        //considering alice as i % 2 == 0
        Pair resp = choose(0, n);
        if (resp.player % 2 == 0 && resp.move == true){
            return true;
        } else if(resp.player % 2 == 1 && resp.move == false){
            return true;
        }
        return false;
    }

    private Pair choose(int i, int n) {

        if(n == 0 || n == 1) {
            return new Pair(i, false);
        }

        int x = -1;
        for(int j = 1; j < n; j++){
            if(n % j == 0) {
                x = j;
                break;
            }
        }

        if(x == -1 && (i % 2 != 0)) {
            return new Pair(i, false);
        }

        n = n - x;
        return choose(i + 1, n);
    }

    class Pair{
        int player;
        boolean move;

        Pair(int p, boolean m){
            player = p;
            move = m;
        }
    }*/
}
