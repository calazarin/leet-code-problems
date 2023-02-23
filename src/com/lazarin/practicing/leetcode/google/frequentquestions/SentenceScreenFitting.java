package com.lazarin.practicing.leetcode.google.frequentquestions;

//https://leetcode.com/problems/sentence-screen-fitting/
public class SentenceScreenFitting {

    public static void main(String args[]){
       /* Input: sentence = ["hello","world"], rows = 2, cols = 8
        Output: 1*/
        System.out.println(wordsTyping2(new String[]{"hello","word"}, 2, 8));

       /* Input: sentence = ["a", "bcd", "e"], rows = 3, cols = 6
        Output: 2*/
        System.out.println(wordsTyping2(new String[]{"a","bcd","e"}, 3, 6));

       /* Input: sentence = ["i","had","apple","pie"], rows = 4, cols = 5
        Output: 1*/
        System.out.println(wordsTyping2(new String[]{"i","had","apple","pie"}, 4, 5));
    }

    /**
     * Given there are n characters in sentence[]
     *
     * Time complexity: O(rows + n)
     *
     * Space complexity: O(n)
     *
     */
    public static int wordsTyping(String[] sentence, int rows, int cols) {

        String s = String.join(" ", sentence) + " "; // This line gives us a formatted sentence to be put to our screen.
        //lenSum is the counter for how many valid characters from s have been put to our entire screen.
        int lenSum = 0;
        int l = s.length();
        for (int i = 0; i < rows; i++) {
            lenSum += cols;
            //This is the situation that we don't need an extra space for current row.
            // //The current row could be successfully fitted. So that we need to increase our counter by using start++.
            if (s.charAt(lenSum % l) == ' ') { // if it is a space, we do not need to trace back, since we already fill partial sentence in current line
                lenSum++;
            } else {
                //if it is an alphabet, we need to trace back to find the most recent space position
                while (lenSum > 0 && s.charAt((lenSum-1) % l) != ' ') {
                    lenSum--;
                }
            }
        }

        return lenSum / s.length(); //it is (# of valid characters) / our formatted sentence.
    }

    public static int wordsTyping2(String[] sentence, int rows, int cols) {
        String s = String.join(" ", sentence) + " "; //This line gives us a formatted sentence to be put to our screen.
        int len = s.length(), count = 0;
        int[] map = new int[len];
        for (int i = 1; i < len; ++i) {
            map[i] = s.charAt(i) == ' ' ? 1 : map[i-1] - 1;
        }
        for (int i = 0; i < rows; ++i) {
            count += cols;
            var mod = count % len;
            count += map[mod];
        }
        return count / len;
    }

    public static int wordsTyping3(String[] sentence, int rows, int cols) {

        int sLen = sentence.length;

        // store the length of each word.
        int[] sentenceLength = new int[sLen];

        // given a starting word index on a given row, save what the starting word index of the next row will be.
        int[] nextWord = new int[sLen];

        // given a starting word index on a given row, save how many (if any) sentences are completed on the given row.
        int[] rowSentences = new int[sLen];

        // precompute the sentence length to save on the String.length call
        for(int i = 0; i < sLen; i++)
            sentenceLength[i] = sentence[i].length();

        // treat each word as a potential starting word for a row and compute what the next row's starting word will be and how
        // many sentences (if any) will be completed on the given row.
        for(int i = 0; i < sLen; i++){

            int currentWord = i;
            int len = 0;
            int totalSentences = 0;

            // loop through every word in the sentence until we have reached the end of the row's length.
            while(len + sentenceLength[currentWord] <= cols){

                len += sentenceLength[currentWord] + 1;
                currentWord++;

                // every time the end of the sentence is reached, increment the count of completed setences for a given starting
                // word on a given row.
                if(currentWord == sLen){
                    currentWord = 0;
                    totalSentences++;
                }

            }

            // save what the next rows starting word will be if the current row's starting word is at i.
            nextWord[i] = currentWord;

            // save how many sentences will be completed if the current row's starting word is at i.
            rowSentences[i] = totalSentences;

        }

        // count all the sentences completed in all rows.
        int totalSentencesInAllRows = 0;

        // the first row will start with the first word in the sentence.
        int startWord = 0;

        // for every row, add the total number of sentences completed in the current row (if any)
        // and grab the index of the starting word of the next row;
        for(int i = 0; i < rows; i++){
            totalSentencesInAllRows += rowSentences[startWord];
            startWord = nextWord[startWord];
        }

        return totalSentencesInAllRows;

    }
}
