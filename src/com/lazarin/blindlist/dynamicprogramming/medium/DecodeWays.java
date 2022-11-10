package com.lazarin.blindlist.dynamicprogramming.medium;

import java.util.HashMap;

public class DecodeWays {

    //https://leetcode.com/problems/decode-ways
    public static void main(String args[]){

       /* Input: s = "12"
        Output: 2
        Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).*/
        System.out.println(numDecodings("12"));

        /*Input: s = "226"
        Output: 3
        Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).*/
        System.out.println(numDecodings("226"));

        /*
        Input: s = "06"
        Output: 0
        Explanation: "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").*/
        System.out.println(numDecodings("06"));
    }

    public static int numDecodings(String s){

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

    public static int numDecodings2(String s){
        HashMap<Integer, Integer> dp = new HashMap<>();
        dp.put(s.length(), 1);
        return helper(s, 0, dp);
    }

    private static int helper(String s, int i, HashMap<Integer, Integer> dp){
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

    private static int getIntValue(String s, int index){

        var givenChar = s.charAt(index);
        var givenCharIntValue = Integer.parseInt(String.valueOf(givenChar));

        return givenCharIntValue;
    }
}
