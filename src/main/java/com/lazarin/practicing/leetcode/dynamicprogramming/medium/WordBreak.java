package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/word-break/
public class WordBreak {

    public static void main(String args[]){

       /* Input: s = "leetcode", wordDict = ["leet","code"]
        Output: true
        Explanation: Return true because "leetcode" can be segmented as "leet code".*/
      //  System.out.println(wordBreak("leetcode", Arrays.asList("leet", "code")));


        /*Input: s = "applepenapple", wordDict = ["apple","pen"]
        Output: true
        Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
        Note that you are allowed to reuse a dictionary word.*/
    //    System.out.println(wordBreak("applepenapple", Arrays.asList("apple","pen")));


       /* Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
        Output: false*/
        //System.out.println(wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")));

       /* "cars"
        ["car","ca","rs"]*/
        System.out.println(wordBreak("cars", Arrays.asList("car","ca","rs")));
    }


    public static boolean wordBreak(String s, List<String> wordDict){


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

    /*public static boolean wordBreak(String s, List<String> wordDict) {

        var canBeSegmented = false;

        for(String w : wordDict){
            var t = s.substring(0, w.length());
            if(t.equals(w)){
                s = s.substring(t.length());
            }
        }
        if(s.isEmpty()) {
            canBeSegmented = true;
        }
        return canBeSegmented;
    }*/
}
