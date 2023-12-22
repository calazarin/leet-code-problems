package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/keyboard-row/)
public class KeyboardRow {

    //approach 1- using hashmap - T: O(n*m)
    public String[] findWords(String[] words) {

        List<String> output = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : "qwertyuiop".toCharArray()){
            map.put(c,1);
        }

        for(char c : "asdfghjkl".toCharArray()){
            map.put(c,2);
        }

        for(char c : "zxcvbnm".toCharArray()){
            map.put(c,3);
        }

        int startingRow;
        for(String word : words){
            startingRow = map.get(word.toLowerCase().charAt(0));
            boolean oneRow = true;
            for(int i = 1; i < word.length(); i++) {
                if(map.get(word.toLowerCase().charAt(i)) != startingRow){
                    oneRow = false;
                    break;
                }
            }
            if(oneRow){
                output.add(word);
            }
        }

        String[] answer = new String[output.size()];
        return output.toArray(answer);
    }

    //approach 2 - using arrays - T: O(n*m)
    public String[] findWords_2(String[] words) {

        int[] rowMap = new int[26];
        String[] rows = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};

        //maps each letter to respective row index
        for(int i = 0; i < rows.length; i++) {
            for(char c : rows[i].toCharArray()){
                rowMap[c - 'A'] = i;
            }
        }

        List<String> result = new ArrayList<>();
        for(String word : words) {
            int row = rowMap[word.toUpperCase().charAt(0) - 'A'];
            boolean sameRow = true;
            for(char c : word.toUpperCase().toCharArray()){
                if(rowMap[c - 'A'] != row){
                    sameRow = false;
                    break;
                }
            }
            if(sameRow){
                result.add(word);
            }
        }

        return result.toArray(new String[0]);

    }
}
