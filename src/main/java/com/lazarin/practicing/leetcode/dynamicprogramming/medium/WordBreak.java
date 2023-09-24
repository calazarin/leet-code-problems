package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/word-break/
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict){

        boolean[] dp = new boolean[s.length() + 1]; //+ 1 for the best case
        Arrays.fill(dp, false);

        dp[s.length()] = true;

        for(int i = s.length(); i >= 0; i--){
            for(String w: wordDict){

                var limit = s.length() - i;
                var wLength = w.length();

                if(wLength <= limit && w.equals(s.substring(i, i+wLength))){
                    dp[i] = dp[i + wLength];
                }
                if(dp[i]){
                    break;
                }

            }
        }
        return dp[0];
    }

}
