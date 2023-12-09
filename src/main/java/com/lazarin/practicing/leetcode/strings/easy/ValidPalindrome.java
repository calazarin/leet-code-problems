package com.lazarin.practicing.leetcode.strings.easy;

//https://leetcode.com/problems/valid-palindrome
public class ValidPalindrome {

    //T: O(n); S: O(1)
    public boolean isPalindrome(String phrase) {

        //regex:
        //^ - not those characters
        //replace all characters that are not a-z, A-Z and O-9 by nothing
        phrase=phrase.replaceAll("[^a-zA-Z0-9]", "");
        phrase=phrase.toLowerCase();

        char[] charArr = phrase.toCharArray();
        int i = 0, j = charArr.length - 1;
        if(charArr.length == 0) return true;
        do{
            var leftChar = charArr[i];
            var rightChar = charArr[j];

            if(leftChar != rightChar) return false;
            i++;
            j--;
        }while (i < j);

        return true;
    }
}
