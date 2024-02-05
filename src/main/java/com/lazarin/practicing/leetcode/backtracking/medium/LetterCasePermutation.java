package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/letter-case-permutation/description/
public class LetterCasePermutation {

    //approach - recursion
    //T: O(2^N) where all characters are letters
    //S: O(N) for the stack space
    public List<String> letterCasePermutation(String s) {
        List<String> permutations = new ArrayList<>();
        permute(0, s, new StringBuilder(), permutations);
        return permutations;    }

    private void permute(int index, String s, StringBuilder temp, List<String> permutations) {

        if(index >= s.length()) {
            permutations.add(temp.toString());
            return;
        }

        char curr = s.charAt(index);
        if (Character.isDigit(curr)){
            temp.append(curr);
            permute(index + 1, s, temp, permutations);
            temp.deleteCharAt(temp.length() - 1);
        } else {
            temp.append(Character.toLowerCase(curr));
            permute(index + 1, s, temp, permutations);
            temp.deleteCharAt(temp.length() - 1);

            temp.append(Character.toUpperCase(curr));
            permute(index + 1, s, temp, permutations);
            temp.deleteCharAt(temp.length() - 1);
        }

    }

    //approach 2 - iterative with queue
    public List<String> letterCasePermutation_2(String s) {
        LinkedList<String> result = new LinkedList<>();
        result.add(s);
        int n = s.length();

        for(int i = n - 1; i >= 0; i--){
            char curr = s.charAt(i);
            if(Character.isLetter(curr)){
                int size = result.size();
                while (size -- > 0) {
                    String currS = result.poll();
                    String left = currS.substring(0, i);
                    String right = currS.substring(i + 1, n);
                    result.add(left + Character.toLowerCase(curr) + right);
                    result.add(left + Character.toUpperCase(curr) + right);
                }
            }
        }

        return result;
    }
}
