package com.lazarin.practicing.leetcode.slidingwindow.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaximumAverageSubarray}
 */
public class MaximumAverageSubarrayTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MaximumAverageSubarray solution = new MaximumAverageSubarray();

        assertThat(solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), is(12.75000));
        assertThat(solution.findMaxAverage(new int[]{5}, 1), is(5.00000));
        assertThat(solution.findMaxAverage(new int[]{-1}, 1), is(-1.00000));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        MaximumAverageSubarray solution = new MaximumAverageSubarray();

        assertThat(solution.findMaxAverage2(new int[]{1, 12, -5, -6, 50, 3}, 4), is(12.75000));
        assertThat(solution.findMaxAverage2(new int[]{5}, 1), is(5.00000));
        assertThat(solution.findMaxAverage2(new int[]{-1}, 1), is(-1.00000));
    }
}
