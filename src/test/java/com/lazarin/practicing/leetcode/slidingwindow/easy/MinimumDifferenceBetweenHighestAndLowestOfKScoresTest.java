package com.lazarin.practicing.leetcode.slidingwindow.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link MinimumDifferenceBetweenHighestAndLowestOfKScores}
 */
public class MinimumDifferenceBetweenHighestAndLowestOfKScoresTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        MinimumDifferenceBetweenHighestAndLowestOfKScores solution =
                new MinimumDifferenceBetweenHighestAndLowestOfKScores();

        assertThat(solution.minimumDifference(new int[]{90}, 1), is(0));
        assertThat(solution.minimumDifference(new int[]{9,4,1,7}, 2), is(2));
    }
}
