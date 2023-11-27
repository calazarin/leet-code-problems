package com.lazarin.practicing.leetcode.trie.hard;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link WordSearchII}
 */
public class WordSearchIITest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        WordSearchII solution = new WordSearchII();

        assertThat(solution.findWords(new char[][]{
            {'o','a','a','n'},{'e','t','a','e'}, {'i','h','k','r'}, {'i','f','l','v'}
        }, new String[]{"oath","pea","eat","rain"}), hasItems("eat","oath"));

        assertThat(solution.findWords(new char[][]{
            {'a','b'}, {'c','d'}
        }, new String[]{"abcb"}), is(Collections.emptyList()));

        assertThat(solution.findWords(new char[][]{
            {'o','a','b','n'},{'o','t','a','e'},{'a','h','k','r'},{'a','f','l','v'}
        }, new String[]{"oa","oaa"}), hasItems("oa","oaa"));
    }
}
