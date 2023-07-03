package com.lazarin.practicing.leetcode.strings.easy;

import java.util.HashMap;

//https://leetcode.com/problems/word-pattern/
public class WordPattern {

    public static void main(String args[]){

        /*Input: pattern = "abba", s = "dog cat cat dog"
        Output: true*/

        /*Input: pattern = "abba", s = "dog cat cat fish"
        Output: false*/

       /* Input: pattern = "aaaa", s = "dog cat cat dog"
        Output: false*/

    }

    //T: O(m+n)
    //S: O(m+n)
    public boolean wordPattern(String pattern, String s) {
        var wordArr = s.split(" ");
        if(wordArr.length != pattern.length()){
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for(int i  = 0; i < pattern.length(); i++){

            char c = pattern.charAt(i);
            String word = wordArr[i];

            if(charToWord.containsKey(c) != wordToChar.containsKey(word)) return false;
            if(charToWord.containsKey(c)){
                if(wordToChar.get(word) != c || !(charToWord.get(c).equals(word))) return false;
            } else {
                charToWord.put(c, word);
                wordToChar.put(word,c);
            }
        }
        return true;
    }

}
