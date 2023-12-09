package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link LongestPalindrome}
 */
public class LongestPalindromeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        LongestPalindrome solution = new LongestPalindrome();
        assertThat(solution.longestPalindrome("abccccdd"), is(7));
        assertThat(solution.longestPalindrome("a"), is(1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        LongestPalindrome solution = new LongestPalindrome();
        assertThat(solution.longestPalindrome_2("abccccdd"), is(7));
        assertThat(solution.longestPalindrome_2("a"), is(1));
    }
}
