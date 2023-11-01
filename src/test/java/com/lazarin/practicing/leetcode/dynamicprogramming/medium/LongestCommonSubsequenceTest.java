package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link LongestCommonSubsequence}
 */
public class LongestCommonSubsequenceTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        LongestCommonSubsequence solution = new LongestCommonSubsequence();

        assertThat(solution.longestCommonSubsequence("abcde", "ace"), is(3));
        assertThat(solution.longestCommonSubsequence("abc", "abc"), is(3));
        assertThat(solution.longestCommonSubsequence("abc", "def"), is(0));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        LongestCommonSubsequence solution = new LongestCommonSubsequence();

        assertThat(solution.longestCommonSubsequence_2("abcde", "ace"), is(3));
        assertThat(solution.longestCommonSubsequence_2("abc", "abc"), is(3));
        assertThat(solution.longestCommonSubsequence_2("abc", "def"), is(0));
    }
}
