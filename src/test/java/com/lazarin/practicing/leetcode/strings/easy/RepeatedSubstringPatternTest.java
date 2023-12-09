package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link RepeatedSubstringPattern}
 */
public class RepeatedSubstringPatternTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        RepeatedSubstringPattern solution = new RepeatedSubstringPattern();

        assertThat(solution.repeatedSubstringPattern("abab"), is(true));
        assertThat(solution.repeatedSubstringPattern("aba"), is(false));
        assertThat(solution.repeatedSubstringPattern("abcabcabcabc"), is(true));
        assertThat(solution.repeatedSubstringPattern("ababab"), is(true));
    }
}
