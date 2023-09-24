package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link WordBreak}
 */
public class WordBreakTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        WordBreak solution = new WordBreak();

        assertThat(solution.wordBreak("leetcode", Arrays.asList("leet", "code")), is(true));
        assertThat(solution.wordBreak("applepenapple", Arrays.asList("apple","pen")), is(true));
        assertThat(solution.wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")), is(false));
    }
}
