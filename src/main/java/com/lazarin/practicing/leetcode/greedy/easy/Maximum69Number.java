package com.lazarin.practicing.leetcode.greedy.easy;

//https://leetcode.com/problems/maximum-69-number/
public class Maximum69Number {

    //approach 1 - brute force
    //T: O(N); S:O(N)
    public int maximum69Number (int num) {
        String numStr = String.valueOf(num);
        char[] charArr = numStr.toCharArray();

        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] == '9') continue;
            charArr[i] = '9';
            break;

        }
        return Integer.parseInt(String.valueOf(charArr));
    }

    public int maximum69Number_2(int num) {
        return Integer.parseInt((String.valueOf(num)).replaceFirst("6","9"));
    }

}
