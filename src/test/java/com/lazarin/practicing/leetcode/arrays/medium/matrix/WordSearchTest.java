package com.lazarin.practicing.leetcode.arrays.medium.matrix;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link WordSearch}
 */
public class WordSearchTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        WordSearch wordSearch = new WordSearch();
        assertThat(wordSearch.exist(new char[][]{{'A','B','C','E'}, {'S','F','C','S'},
                {'A','D','E','E'}},"ABCCED"), is(true));
        assertThat(wordSearch.exist(new char[][]{{'A','B','C','E'}, {'S','F','C','S'},
                {'A','D','E','E'}},"SEE"), is(true));
        assertThat(wordSearch.exist(new char[][]{{'A','B','C','E'}, {'S','F','C','S'},
                {'A','D','E','E'}},"ABCB"), is(false));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        WordSearch wordSearch = new WordSearch();
        assertThat(wordSearch.exist2(new char[][]{{'A','B','C','E'}, {'S','F','C','S'},
                {'A','D','E','E'}},"ABCCED"), is(true));
        assertThat(wordSearch.exist2(new char[][]{{'A','B','C','E'}, {'S','F','C','S'},
                {'A','D','E','E'}},"SEE"), is(true));
        assertThat(wordSearch.exist2(new char[][]{{'A','B','C','E'}, {'S','F','C','S'},
                {'A','D','E','E'}},"ABCB"), is(false));
    }

}
