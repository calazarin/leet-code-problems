package com.lazarin.practicing.leetcode.strings.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {
    public static void main(String args[]){

        GroupAnagrams ga = new GroupAnagrams();

   /*     Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]*/
        var resp = ga.groupAnagrams2(new String[] {"eat","tea","tan","ate","nat","bat"});
        printResp(resp);
       /* Input: strs = [""]
        Output: [[""]]*/

     /*   Input: strs = ["a"]
        Output: [["a"]]*/

    }

    private static void printResp(List<List<String>> resp){
        for(List<String> respList : resp){
            for(String value : respList){
                System.out.print(value+",");
            }
            System.out.print("\n");
        }
    }

    //O(m * nlogn)
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String sorted = new String(wordArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }

    //optimal solution
    //O(M*N) - m amount of strings and n the length
    public List<List<String>> groupAnagrams2(String[] strs){

        Map<int[], List<String>> charCountMap = new HashMap<>();
        List<List<String>> groupedAnagrams = new ArrayList<>();
        for(String s : strs){
            //a.....z
            int[] charCount = new int[26];
            for(char c : s.toCharArray()){
                var charIndex = c - 'a';
                charCount[charIndex]++;
            }
            if(!charCountMap.containsKey(charCount)){
                charCountMap.put(charCount, new ArrayList<>());
            }
            charCountMap.get(charCount).add(s);

        }
        groupedAnagrams.addAll(charCountMap.values());
        return groupedAnagrams;
    }
}
