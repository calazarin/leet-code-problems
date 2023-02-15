package com.lazarin.blindlistandmore.strings.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/ransom-note/description/
public class RansomNote {

    public static void main(String args[]){

        RansomNote rs = new RansomNote();

       /* Input: ransomNote = "a", magazine = "b"
        Output: false*/
        System.out.println(rs.canConstruct("a","b"));

        /*Input: ransomNote = "aa", magazine = "ab"
        Output: false*/
        System.out.println(rs.canConstruct("aa","ab"));

      /*  Input: ransomNote = "aa", magazine = "aab"
        Output: true*/
        System.out.println(rs.canConstruct("aa","aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            if(map.containsKey(magazine.charAt(i))){
                var counter = map.get(magazine.charAt(i));
                map.put(magazine.charAt(i), ++counter);
            } else {
                map.put(magazine.charAt(i), 1);
            }
        }

        for(int j = 0; j  < ransomNote.length(); j++){
            if(!map.containsKey(ransomNote.charAt(j))){
                return false;
            }

            var counter = map.get(ransomNote.charAt(j));
            if(counter == 0) {
                return false;
            } else {
                map.put(ransomNote.charAt(j), --counter);
            }
        }

        return false;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }

}
