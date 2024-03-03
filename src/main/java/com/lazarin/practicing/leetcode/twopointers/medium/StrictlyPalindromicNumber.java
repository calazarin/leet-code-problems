package com.lazarin.practicing.leetcode.twopointers.medium;

//https://leetcode.com/problems/strictly-palindromic-number/description/
public class StrictlyPalindromicNumber {

    public boolean isStrictlyPalindromic(int n) {
        for(int b = 2; b <= n-2; b++){
            String numStr = convert(n, b);
            if(!numStr.equals(new StringBuilder(numStr).reverse().toString())){
                return false;
            }
        }

        return true;
    }

    private String convert(int number, int base){
        StringBuilder numStr = new StringBuilder();
        while(number > 0){
            numStr.append(number % base);
            number /= base;
        }
        return numStr.toString();
    }
}
