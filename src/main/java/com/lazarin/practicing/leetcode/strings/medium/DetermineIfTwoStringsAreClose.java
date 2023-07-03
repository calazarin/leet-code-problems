package com.lazarin.practicing.leetcode.strings.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/determine-if-two-strings-are-close
public class DetermineIfTwoStringsAreClose {

    //T: O(nlogn)
    //S: O(N)
    public boolean closeStrings(String word1, String word2){

        if(word1.length() !=  word2.length()) return false;

        int[] counter1 = new int[26];
        int[] counter2 = new int[26];

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for(char c : word1.toCharArray()){
            counter1[c - 'a']++; //counting the frequency of each character
            set1.add(c); //make sure both strings have same characters
        }

        for(char c : word2.toCharArray()){
            counter2[c - 'a']++; //counting the frequency of each character
            set2.add(c); //make sure both strings have same characters
        }

        Arrays.sort(counter1);
        Arrays.sort(counter2);

        return set1.equals(set2) && Arrays.equals(counter1, counter2);
    }

    //T: O(nlogn)
    //S: O(N)
    public boolean closeStrings2(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        HashMap<Character, Integer> word1Map = new HashMap<>();
        HashMap<Character, Integer> word2Map = new HashMap<>();

        for (char c : word1.toCharArray()) {
            word1Map.put(c, word1Map.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            word2Map.put(c, word2Map.getOrDefault(c, 0) + 1);
        }

        //first operation: both strings must have the same characters
        if (!word1Map.keySet().equals(word2Map.keySet())) {
            return false;
        }


        //second operation: two different characters with same frequency
        List<Integer> freqList1 = new ArrayList<>(word1Map.values());
        Collections.sort(freqList1);//O(logn)
        List<Integer> freqList2 = new ArrayList<>(word2Map.values());
        Collections.sort(freqList2); //O(logn)

        return freqList1.equals(freqList2);
    }
}
