package com.lazarin.practicing.leetcode.strings.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/reverse-vowels-of-a-string/description/
public class ReverseVowelsOfaString {

    //T: O(N)
    //S: O(N)
    public String reverseVowels(String s) {

        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');

        char[] charArr = s.toCharArray();

        int i = 0, j = charArr.length - 1;

        while(i < j){


            while(i < j && !vowels.contains(charArr[i])){
                i++;
            }

            while (i < j && !vowels.contains(charArr[j])){
                j--;
            }

            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;

            i++;
            j--;
        }
        return new String(charArr);
    }

    //T: O(N)
    //S: O(N)
    public String reverseVowels_2(String s) {
        int start = 0;
        int end = s.length() - 1;
        // Convert String to char array as String is immutable in Java
        char[] sChar = s.toCharArray();

        // While we still have characters to traverse
        while (start < end) {
            // Find the leftmost vowel
            while (start < s.length () && !isVowel2(sChar[start])) {
                start++;
            }
            // Find the rightmost vowel
            while (end >= 0 && !isVowel2(sChar[end])) {
                end--;
            }
            // Swap them if start is left of end
            if (start < end) {
                swap(sChar, start++, end--);
            }
        }

        // Converting char array back to String
        return new String(sChar);
    }

    // Function to swap characters at index x and y
    void swap(char[] chars, int x, int y) {
        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
    }

    // Return true if the character is a vowel (case-insensitive)
    boolean isVowel2(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
                || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
}
