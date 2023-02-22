package com.lazarin.learning.dynamicprogramming.memoization.string;

import java.util.HashMap;

public class CanConstructMan {

    public static void main (String args[]){

        //abcdef, [ab, abc, cd, def, abcd] => true
         var result = canConstruct("abcdef", new String[] {"ab","abc", "cd", "def", "abcd"},
                 new HashMap<>());
         System.out.println(result);

        // skateboard, [bo, rd, ate, t, ska ,sk ,boar] => false
        var result2 = canConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"},
                new HashMap<>());
        System.out.println(result2);

        // enterapotentpot [a, p, ent, enter, ot, o, t] => true
        var result3 = canConstruct("enterapotentpot", new String[] {"a", "p", "ent", "enter", "ot", "o", "t"},
                new HashMap<>());
        System.out.println(result3);

        //eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef, [e, ee, eee, eeee, eeeee, eeeeee]
        var result4 = canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                new String[] {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}, new HashMap<>());
        System.out.println(result4);

    }

    private static boolean canConstruct(String target, String[] wordBank, HashMap<String, Boolean> memo) {
        if(memo.containsKey(target))return memo.get(target);
        if(target.isEmpty()) return true;

        for(String word : wordBank){
            var isPrefix = target.indexOf(word) == 0; //is the world a prefix (not in the middle)?
            if(isPrefix) {
                var suffix = target.substring(word.length());
                var result = canConstruct(suffix, wordBank, memo);
                if(result) {
                    memo.put(target, true);
                    return true;
                }
            }

        }
        memo.put(target, false);
        return false;
    }


}
