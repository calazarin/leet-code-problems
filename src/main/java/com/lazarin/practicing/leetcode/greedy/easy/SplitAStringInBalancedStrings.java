package com.lazarin.practicing.leetcode.greedy.easy;

//https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
public class SplitAStringInBalancedStrings {

    //approach - greedy algorithm counting the letters
    public int balancedStringSplit(String s) {
        int ans = 0, temp = 0;
        char[] charArr = s.toCharArray();
        char flag = charArr[0];
        for(int i = 0; i < charArr.length; i++) {
            //whenever I see a R a will increment counter
            if(charArr[i] == flag) {
                temp += 1;
            } else { //whenever I see a L a will decrement the counter
                temp -= 1;
            }
            if(temp == 0) ans += 1;

        }
        return ans;
    }
}
