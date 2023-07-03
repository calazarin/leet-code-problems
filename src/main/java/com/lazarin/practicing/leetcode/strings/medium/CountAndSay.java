package com.lazarin.practicing.leetcode.strings.medium;

//https://leetcode.com/problems/count-and-say/
public class CountAndSay {

    //approach 1
    //T: O(4^n/3)
    public String countAndSay(int n) {
        String currentString = "1";
        for (int i = 2; i <= n; i++) {
            String nextString = "";
            for (int j = 0, k = 0; j < currentString.length(); j = k) {
                while (k < currentString.length() && currentString.charAt(k) == currentString.charAt(j)){
                    k++;
                }
                nextString += Integer.toString(k - j) + currentString.charAt(j);
            }
            currentString = nextString;
        }
        return currentString;
    }

}
