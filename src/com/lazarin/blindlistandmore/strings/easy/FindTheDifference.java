package com.lazarin.blindlistandmore.strings.easy;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-difference/
public class FindTheDifference {

    public static void main(String args[]){

       /* Input: s = "abcd", t = "abcde"
        Output: "e"
        Explanation: 'e' is the letter that was added.*/

       /* Input: s = "", t = "y"
        Output: "y"*/

    }

    //T: O(N)
    //S: O(N)
    public char findTheDifference(String s, String t) {
        int[] charCount = new int[26];
        Arrays.fill(charCount, 0);

        for(int i = 0; i < s.length(); i++){
            char s_c = s.charAt(i);
            int charIndex = s_c - 'a';
            charCount[charIndex]++;
        }

        char added_char = ' ';
        for(int j = 0; j < t.length(); j++){

            char t_c = t.charAt(j);
            int t_char_index = t_c - 'a';
            int currentCounter = charCount[t_char_index];
            if(currentCounter - 1 < 0){
                added_char = t_c;
            } else {
                charCount[t_char_index]--;
            }

        }

        return added_char;
    }

    //approach 2 - a little more optimal
    //Idea is ascii sum of second string - ascii sum in first string will leave us with ascii of the extra letter.
    public char findTheDifference2(String s, String t){
        int charCode = t.charAt(s.length());
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) {
            charCode -= s.charAt(i);
            charCode += t.charAt(i);
        }
        return (char)charCode;
    }
}
