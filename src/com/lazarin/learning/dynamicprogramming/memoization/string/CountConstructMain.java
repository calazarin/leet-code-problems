package com.lazarin.learning.dynamicprogramming.memoization.string;

import java.util.HashMap;

public class CountConstructMain {

    public static void main(String args[]){

        var result = countConstruct("purple", new String[] {"purp","p", "ur", "le", "purpl"}, //2
                new HashMap<>());
        System.out.println(result);

        var result2 = countConstruct("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}, //1
                new HashMap<>());
        System.out.println(result2);

        var result3 = countConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"},
                new HashMap<>()); //0
        System.out.println(result3);

        var result4 = countConstruct("enterapotentpot",
                new String[] {"a", "p", "ent", "enter", "ot", "o", "t"}, new HashMap<>());
        System.out.println(result4); //4

        //eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef, [e, ee, eee, eeee, eeeee, eeeeee]
        var result5 = countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                new String[] {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}, new HashMap<>());
        System.out.println(result5);
    }

    private static Integer countConstruct(String targetString, String[] worldBank, HashMap<String, Integer> memo) {

        if(targetString == "") return 1;

        int totalCount = 0;
        for(String word : worldBank){
            boolean isPrefix = targetString.indexOf(word) == 0;
            if(isPrefix){
                String suffix = targetString.substring(word.length());
                var counter = countConstruct(suffix, worldBank, memo);
                totalCount += counter;
            }
        }
        return totalCount;
    }

}
