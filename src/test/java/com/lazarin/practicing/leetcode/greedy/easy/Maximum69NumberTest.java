package com.lazarin.practicing.leetcode.greedy.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link Maximum69Number}
 */
public class Maximum69NumberTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        Maximum69Number solution = new Maximum69Number();
        assertThat(solution.maximum69Number(9669), is(9969));
        assertThat(solution.maximum69Number(9996), is(9999));
        assertThat(solution.maximum69Number(9999), is(9999));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        Maximum69Number solution = new Maximum69Number();
        assertThat(solution.maximum69Number_2(9669), is(9969));
        assertThat(solution.maximum69Number_2(9996), is(9999));
        assertThat(solution.maximum69Number_2(9999), is(9999));
    }

}
