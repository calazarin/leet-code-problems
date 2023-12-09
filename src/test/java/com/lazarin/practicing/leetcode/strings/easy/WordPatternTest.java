package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link WordPattern}
 */
public class WordPatternTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        WordPattern solution = new WordPattern();
        assertThat(solution.wordPattern("abba","dog cat cat dog"), is(true));
        assertThat(solution.wordPattern("abba", "dog cat cat fish"), is(false));
        assertThat(solution.wordPattern("aaaa", "dog cat cat dog"), is(false));
    }
}
