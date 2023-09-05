package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaximumSubsequenceScore}
 */
public class MaximumSubsequenceScoreTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        MaximumSubsequenceScore solution = new MaximumSubsequenceScore();

        assertThat(solution.maxScore(new int[]{1,3,3,2}, new int[]{2,1,3,4}, 3), is(12l));
        assertThat(solution.maxScore(new int[]{4,2,3,1,1}, new int[]{7,5,10,9,6}, 1), is(30l));

    }
}

