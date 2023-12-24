package com.lazarin.practicing.leetcode.twopointers.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ReverseStringII}
 */
public class ReverseStringIITest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        ReverseStringII solution = new ReverseStringII();

        assertThat(solution.reverseStr("abcdefg", 2), is("bacdfeg"));
        assertThat(solution.reverseStr("abcd", 2), is("bacd"));
    }
}

