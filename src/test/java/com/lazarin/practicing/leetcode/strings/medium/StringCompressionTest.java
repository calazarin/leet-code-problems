package com.lazarin.practicing.leetcode.strings.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link StringCompression}
 */
public class StringCompressionTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        StringCompression solution = new StringCompression();
        assertThat(solution.compress(new char[]{'a','a','b','b','c','c','c'}), is(6));
        assertThat(solution.compress(new char[]{'a'}), is(1));
        assertThat(solution.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}), is(4));
    }
}
