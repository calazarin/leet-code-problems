package com.lazarin.practicing.leetcode.heap.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link LargestNumberAfterDigitSwapsByParity}
 */
public class LargestNumberAfterDigitSwapsByParityTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        LargestNumberAfterDigitSwapsByParity solution = new LargestNumberAfterDigitSwapsByParity();
        assertThat(solution.largestInteger(1234), is(3412));
        assertThat(solution.largestInteger(65875), is(87655));
    }
}
