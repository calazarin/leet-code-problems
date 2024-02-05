package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link BeautifulArrangement}
 */
public class BeautifulArrangementTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        BeautifulArrangement solution = new BeautifulArrangement();
        assertThat(solution.countArrangement(2), is(2));
        assertThat(solution.countArrangement(1), is(1));
    }
}
