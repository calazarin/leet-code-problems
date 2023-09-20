package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number
public class LetterCombinationsOfPhoneNumber {

    //approach 1 - backtracking with string builder
    public List<String> letterCombinations(String digits) {

        if(digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        Map<Integer, char[]> map = getCharMap();
        List<String> output = new ArrayList<>();

        backtrack(0, output, new StringBuilder(), digits, map);
        return output;
    }

    private void backtrack(int index, List<String> output,
                           StringBuilder builder,
                           String digits,
                           Map<Integer, char[]> map){
        if(index == digits.length()){
            output.add(builder.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        char[] letters = map.get(digit);
        for(int i = 0; i < letters.length; i++){
            builder.append(letters[i]);
            backtrack(index + 1, output, builder, digits, map);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    //0, a-b-c, "a", []
    private List<String> dfs(int index, String digits, StringBuilder builder,
                             List<String> output, Map<Integer, char[]> map) {

        if(index == digits.length() - 1) {
            return Arrays.asList(builder.toString());
        }

        for(int i = index + 1; i < digits.length(); i++){ //i=1
            int next_digit = digits.charAt(i) - '0';  //3
            char[] next_chars = map.get(next_digit); //d,e,f

            for(char c : next_chars) { //c = d
                builder.append(c);  //ad
                List<String> combinations = dfs(i, digits, builder, output, map);
                output.addAll(combinations); //[ad,ae,af]
                builder.deleteCharAt(builder.length() - 1);
            }
        }

        return output;
    }

    private Map<Integer, char[]> getCharMap(){
        Map<Integer, char[]> map = new HashMap<>();
        map.put(2, new char[]{'a','b','c'});
        map.put(3, new char[]{'d','e','f'});
        map.put(4, new char[]{'g','h','i'});
        map.put(5, new char[]{'j','k','l'});
        map.put(6, new char[]{'m','n','o'});
        map.put(7, new char[]{'p','q','r','s'});
        map.put(8, new char[]{'t','u','v'});
        map.put(9, new char[]{'w','x','y','z'});
        return map;
    }

    //approach 2 - backtracking with string
    public List<String> letterCombinations2(String digits) {
        List<String> l = new ArrayList<>();
        if(digits == null || digits.length() == 0) return l;
        HashMap<Character, String> map = buildMap();
        solve(digits, 0, l, map, "");
        return l;
    }

    private void solve(String digits, int index, List<String> l, HashMap<Character, String> map, String res){
        if(index == digits.length()) {
            l.add(res);
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(int i = 0; i < letters.length(); i++){
            String newString = res + letters.charAt(i);
            solve(digits, index + 1, l, map, newString);
        }
    }

    private HashMap<Character, String> buildMap(){
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        return map;
    }

}
