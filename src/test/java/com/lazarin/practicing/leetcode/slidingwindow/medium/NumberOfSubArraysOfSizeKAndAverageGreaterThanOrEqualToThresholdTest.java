package com.lazarin.practicing.leetcode.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold}
 */
public class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThresholdTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold solution = new NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold();

        assertThat(solution.numOfSubarrays(new int[]{2,2,2,2,5,5,5,8}, 3, 4), is(3));
        assertThat(solution.numOfSubarrays(new int[]{11,13,17,23,29,31,7,5,2,3}, 3, 5), is(6));
        assertThat(solution.numOfSubarrays(new int[]{1,1,1,1,1}, 1, 0), is(5));
    }
}
