package com.lazarin.practicing.leetcode.twopointers.easy;

public class ReverseWordsInaStringIII {

    //approach - two pointers splitting by white space
    public String reverseWords(String s) {
        StringBuilder output = new StringBuilder();
        String[] words = s.split(" ");
        for(String w : words) {

            char[] chars = w.toCharArray();
            int i = 0, j = chars.length - 1;

            while(i < j){
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i += 1;
                j -= 1;
            }

            output.append(new String(chars));
            output.append(" ");
        }

        return output.toString().trim();
    }

    //approach - two pointers without splitting it
    //T: O(N); S: O(1)
    public String reverseWords_2(String s) {
        int lastSpaceIndex = -1;
        char[] chArray = s.toCharArray();
        int len = s.length();
        for (int strIndex = 0; strIndex <= len; strIndex++) {
            if (strIndex == len || chArray[strIndex] == ' ') {
                int startIndex = lastSpaceIndex + 1;
                int endIndex = strIndex - 1;
                while (startIndex < endIndex) {
                    char temp = chArray[startIndex];
                    chArray[startIndex] = chArray[endIndex];
                    chArray[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
                lastSpaceIndex = strIndex;
            }
        }
        return new String(chArray);
    }
}
