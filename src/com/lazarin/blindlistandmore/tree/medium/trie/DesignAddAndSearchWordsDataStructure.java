package com.lazarin.blindlistandmore.tree.medium.trie;

//https://leetcode.com/problems/design-add-and-search-words-data-structure/
public class DesignAddAndSearchWordsDataStructure {

    public static void main(String args[]) {

        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("pad"));
        System.out.println(wordDictionary.search("bad"));
        System.out.println(wordDictionary.search(".ad"));
        System.out.println(wordDictionary.search("b.."));
    }

}


