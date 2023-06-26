package com.lazarin.practicing.leetcode.arrays.slidewindow.medium;

import java.util.Set;

//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length
public class MaximumNumberOfVowelsSubstringOfGivenLength {

    public static void main(String args[]){

        MaximumNumberOfVowelsSubstringOfGivenLength solution =
                new MaximumNumberOfVowelsSubstringOfGivenLength();
        /*Input: s = "abciiidef", k = 3
        Output: 3*/
        System.out.println(solution.maxVowels("abciiidef",3));

        /*Input: s = "aeiou", k = 2
        Output: 2*/
        System.out.println(solution.maxVowels("aeiou",2));

       /* Input: s = "leetcode", k = 3
        Output: 2*/
        System.out.println(solution.maxVowels("leetcode",3));
    }

    //approach - sliding window
    public int maxVowels(String s, int k) {

        int maxCounter = Integer.MIN_VALUE;
        int vowelCounter = 0;
        for(int i = 0; i < s.length(); i++){

            if (i < k){

                if(isVowel(s.charAt(i))){
                    vowelCounter++;
                }
                maxCounter = Math.max(maxCounter, vowelCounter);
            } else {

                int previousStart = i - k;
                if(isVowel(s.charAt(previousStart))){
                    vowelCounter--;
                }
                if(isVowel(s.charAt(i))){
                    vowelCounter++;
                }
                maxCounter = Math.max(maxCounter, vowelCounter);
            }

        }
        return maxCounter;
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    //approach - sliding window 2
    //T: O(N)
    //S: O(1)
    public int maxVowels2(String s, int k) {

        Set<Character> vowels = Set.of('a','e','i','o','u');
        int answer = 0, count = 0;

        for(int i = 0; i < k; i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }
        }
        answer = count;
        //slide the window to the right, remove the character and update the counter
        for(int i = k; i < s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }
            if(vowels.contains(s.charAt(i - k))){
                count--;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }
}
