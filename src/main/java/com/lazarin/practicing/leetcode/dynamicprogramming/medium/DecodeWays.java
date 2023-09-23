package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import java.util.HashMap;

//https://leetcode.com/problems/decode-ways
public class DecodeWays {

    //approach 1
    public int numDecodings(String s){

        int[] dp = new int[s.length() + 1];
        dp[0] = 1; //one way of decoding (not decoding)
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i = 2; i <= s.length(); i++){

            int oneDigit = Integer.valueOf(s.substring(i - 1, i));
            int twoDigits = Integer.valueOf(s.substring(i - 2, i));

            if(oneDigit >= 1){
                dp[i] += dp[i - 1];
            }
            if(twoDigits >= 10 && twoDigits <= 26){
                dp[i] += dp[i - 2];
            }
        }

        return dp[s.length()];
    }

    //approach 2
    public int numDecodings2(String s){
        HashMap<Integer, Integer> dp = new HashMap<>();
        dp.put(s.length(), 1);
        return helper(s, 0, dp);
    }

    private int helper(String s, int i, HashMap<Integer, Integer> dp){
        if(dp.containsKey(i)){
            return dp.get(i);
        }
        if(s.charAt(i) == '0'){
            return 0;
        }
        var res = helper(s, i + 1, dp);
        if(i + 1 < s.length() &&
            (s.charAt(i) == '1' || s.charAt(i) == '2' && getIntValue(s, i) + 1 <= 6 )){
            res +=  helper(s, i + 2, dp);
        }
        dp.put(i, res);
        return res;
    }

    private int getIntValue(String s, int index){

        var givenChar = s.charAt(index);
        var givenCharIntValue = Integer.parseInt(String.valueOf(givenChar));

        return givenCharIntValue;
    }
}
