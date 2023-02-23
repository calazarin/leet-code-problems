package com.lazarin.learning.leetcode.recursion.string;

public class Palindrome {

    public static void main(String args[]){
        var result = isPalindrome("kaiak");
        System.out.println(result);
    }

    public static boolean isPalindrome(String input){

        System.out.println(input);

        //first, the best case
        if(input.length() == 0 || input.length() == 1) {
            return true;
        }

        if(input.charAt(0) == input.charAt(input.length() - 1)){
            return isPalindrome(input.substring(1, input.length() -1));
        }

        return false;
    }
}
