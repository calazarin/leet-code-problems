package com.lazarin.practicing.leetcode.strings.easy;

//https://leetcode.com/problems/valid-palindrome
public class ValidPalindrome {

    public static void main(String args[]){

        // s = "A man, a plan, a canal: Panama" => TRUE
        var resp = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(resp);

        //s = "race a car" => FALSE
        var resp3 = isPalindrome("race a car");
        System.out.println(resp3);


        //s = " " => TRUE
    }

    //T: O(n); S: O(1)
    public static boolean isPalindrome(String phrase) {

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
