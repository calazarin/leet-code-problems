package com.lazarin.practicing.leetcode.strings.easy;

//https://leetcode.com/problems/greatest-common-divisor-of-strings/
public class GreatestCommonDivisorOfStrings {

    //T: O(min(m,n)⋅(m+n))
    //S: O(min(m,n))
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        for(int i = Math.min(len1, len2); i >= 1 ; --i){
            if(isDivisor(i, str1, str2)){
                return str1.substring(0, i);
            }

        }
        return "";
    }

    private boolean isDivisor(int factor, String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1 % factor != 0 || len2 % factor != 0){
            return false;
        }
        String base = str1.substring(0, factor);
        return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
    }
}
