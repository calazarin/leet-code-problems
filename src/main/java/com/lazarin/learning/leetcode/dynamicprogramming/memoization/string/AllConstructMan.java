package com.lazarin.learning.leetcode.dynamicprogramming.memoization.string;

import java.util.ArrayList;
import java.util.HashMap;

public class AllConstructMan {

    public static void main(String args[]){

        /*
        [
            ['purp','le'],
            ['p','ur', 'p', 'le']
        ]
         */
        var result = allConstruct("purple", new String[] {"purp","p", "ur", "le", "purpl"},
                new HashMap<>());

        System.out.println(result);

         /*
        [
            ['ab','cd', 'ef'],
            ['ab','c', 'def'],
            ['abc','def'],
            ['abcd','ef'],
        ]
         */
        var result2 = allConstruct("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}, //1
                new HashMap<>());
        System.out.println(result2);


        /*
        []
         */
        var result3 = allConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"},
                new HashMap<>()); //0
        System.out.println(result3);

         /*
        []
         */
        var result4 = allConstruct("enterapotentpot",
                new String[] {"a", "p", "ent", "enter", "ot", "o", "t"}, new HashMap<>());
        System.out.println(result4); //4

    }

    public static ArrayList<ArrayList<String>> allConstruct(String target, String[] wordBank, HashMap<String, String> memo){

        if(target == "") return new ArrayList<>();

        ArrayList<ArrayList<String>> result = new ArrayList<>();

        for(String word : wordBank){

            boolean isPrefix = target.indexOf(word) == 0;

            if (isPrefix) {
                String suffix = target.substring(word.length());
                ArrayList<ArrayList<String>> suffixWays = allConstruct(suffix, wordBank, memo);

                if(suffixWays.isEmpty()){
                    var newSuffixWays = new ArrayList<String>();
                    newSuffixWays.add(word);
                    suffixWays.add(newSuffixWays);
                } else {
                    suffixWays.forEach(subSuffixWays -> subSuffixWays.add(0, word));
                }
                result.addAll(suffixWays);
            }

        }

        return result;
    }

}
