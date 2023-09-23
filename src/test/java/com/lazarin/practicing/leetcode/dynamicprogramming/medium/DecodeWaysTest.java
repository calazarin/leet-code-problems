package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link DecodeWays}
 */
public class DecodeWaysTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        DecodeWays solution = new DecodeWays();

        assertThat(solution.numDecodings("12"), is(2));
        assertThat(solution.numDecodings("226"), is(3));
        assertThat(solution.numDecodings("06"), is(0));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        DecodeWays solution = new DecodeWays();

        assertThat(solution.numDecodings2("12"), is(2));
        assertThat(solution.numDecodings2("226"), is(3));
        assertThat(solution.numDecodings2("06"), is(0));
    }
}
