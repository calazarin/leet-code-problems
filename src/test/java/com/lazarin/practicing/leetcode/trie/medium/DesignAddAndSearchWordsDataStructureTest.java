package com.lazarin.practicing.leetcode.trie.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link com.lazarin.practicing.leetcode.trie.medium.DesignAddAndSearchWordsDataStructure }
 */
public class DesignAddAndSearchWordsDataStructureTest {

    @Test
    public void shouldReturnExpectedAnswers_test1() {

        DesignAddAndSearchWordsDataStructure.WordDictionary wordDictionary =
                new DesignAddAndSearchWordsDataStructure().new WordDictionary();

        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");

       assertThat(wordDictionary.search("pad"), is(false));
       assertThat(wordDictionary.search("bad"), is(true));
       assertThat(wordDictionary.search(".ad"), is(true));
       assertThat(wordDictionary.search("b.."), is(true));

    }

    @Test
    public void shouldReturnExpectedAnswers_test2() {

        DesignAddAndSearchWordsDataStructure.WordDictionary wordDictionary =
                new DesignAddAndSearchWordsDataStructure().new WordDictionary();

        wordDictionary.addWord("a");
        wordDictionary.addWord("a");

        assertThat(wordDictionary.search("."), is(true));
        assertThat(wordDictionary.search("a"), is(true));
        assertThat(wordDictionary.search("aa"), is(false));
        assertThat(wordDictionary.search("a"), is(true));
        assertThat(wordDictionary.search(".a"), is(false));
        assertThat(wordDictionary.search("a."), is(false));

    }
}
