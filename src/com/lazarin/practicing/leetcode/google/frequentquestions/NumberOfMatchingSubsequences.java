package com.lazarin.googlequestions.interviewprocess;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

//https://leetcode.com/problems/number-of-matching-subsequences/
public class NumberOfMatchingSubsequences {

    public static void main(String args[]){

        /*Input: s = "abcde", words = ["a","bb","acd","ace"]
        Output: 3*/
        System.out.println(numMatchingSubseq3("abcde", new String[]{"a","bb","acd","ace"}));
      //  System.out.println(numMatchingSubseq("abcde", new String[]{"acd","ace"}));

        /*Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
        Output: 2*/
        System.out.println(numMatchingSubseq("dsahjpjauf", new String[]{
                "ahjpjau","ja","ahbwzgqnuk","tnmlanowax"}));
    }

    public static int numMatchingSubseq(String s, String[] words) {

        char[] characteres = s.toCharArray();
        int resp = 0;
        for(String word : words){
            char[] wordChars = word.toCharArray();
            int counter = 0, found = 0;
            for(int i = 0; i < wordChars.length; i++){
                char toBeFound = wordChars[i];
                for(; counter < characteres.length; counter++){
                    if(characteres[counter] == toBeFound){
                        found++;
                        counter++;
                        break;
                    }
                }
            }
            if(found == wordChars.length){
                resp++;
            }
        }
        return resp;
    }

    char[] ca, cb;
    public int numMatchingSubseq2(String S, String[] words) {
        int ans = 0;
        ca = S.toCharArray();
        for (String word: words)
            if (subseq(word)) ans++;
        return ans;
    }

    public boolean subseq(String word) {
        int i = 0;
        cb = word.toCharArray();
        for (char c: ca) {
            if (i < cb.length && c == cb[i]) i++;
        }
        return (i == cb.length);
    }

    public static int numMatchingSubseq3(String s, String[] words) {

        Map<Character, Queue<String>> charactersMap = new HashMap<>();
        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            charactersMap.putIfAbsent(s.charAt(i), new LinkedList<>());
        }

        for(String word : words){
            char startChar = word.charAt(0);
            if(charactersMap.containsKey(startChar)){
                charactersMap.get(startChar).offer(word);
            }
        }

        for(int i = 0; i < s.length(); i++){
            char startChar = s.charAt(i);
            Queue<String> possibleWords = charactersMap.get(startChar);

            int size = possibleWords.size();

            for(int j = 0; j < size; j++){
                String currentWord = possibleWords.poll();
                if(currentWord.substring(1).length() == 0){
                    answer++;
                } else{
                    var key = currentWord.charAt(1);
                    if(charactersMap.containsKey(key)){
                        var keyToRetrieve = currentWord.charAt(1);
                        charactersMap.get(keyToRetrieve).add(currentWord.substring(1));
                    }
                }

            }
        }

        return answer;
    }
}
