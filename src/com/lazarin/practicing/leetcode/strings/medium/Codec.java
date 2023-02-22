package com.lazarin.practicing.leetcode.strings.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/encode-and-decode-strings
public class Codec {

    public String encode2(List<String> words){
        StringBuilder result = new StringBuilder();
        for(String word : words){
            result.append(word.length());
            result.append("#");
            result.append(word);
        }
        return result.toString();
    }

    public List<String> decode2(String encodedStr) {

        List<String> words = new ArrayList<>();
        int i =0;
        while( i < encodedStr.length()){
            var j = i;
            while(encodedStr.charAt(j) != '#'){
                j++;
            }
            var length = Integer.valueOf(encodedStr.substring(i,j));
            var str = encodedStr.substring(j+1,j + 1 + length);
            words.add(str);
            i = j + 1 + length;
        }
        return words;
    }

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if (strs.size() == 0) return Character.toString((char)258);

        String d = Character.toString((char)257);
        StringBuilder sb = new StringBuilder();
        for(String s: strs) {
            sb.append(s);
            sb.append(d);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        String d = Character.toString((char)258);
        if (s.equals(d)) return new ArrayList();

        d = Character.toString((char)257);

        return Arrays.asList(s.split(d, -1));
    }
}
