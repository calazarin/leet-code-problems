package com.lazarin.practicing.leetcode.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link CountNumberOfNiceSubarrays}
 */
public class CountNumberOfNiceSubarraysTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        CountNumberOfNiceSubarrays solution = new CountNumberOfNiceSubarrays();

        assertThat(solution.numberOfSubarrays(new int[]{1,1,2,1,1}, 3), is(2));
        assertThat(solution.numberOfSubarrays(new int[]{2,4,6}, 1), is(0));
        assertThat(solution.numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2}, 2), is(16));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        CountNumberOfNiceSubarrays solution = new CountNumberOfNiceSubarrays();

        assertThat(solution.numberOfSubarrays_2(new int[]{1,1,2,1,1}, 3), is(2));
        assertThat(solution.numberOfSubarrays_2(new int[]{2,4,6}, 1), is(0));
        assertThat(solution.numberOfSubarrays_2(new int[]{2,2,2,1,2,2,1,2,2,2}, 2), is(16));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3() {

        CountNumberOfNiceSubarrays solution = new CountNumberOfNiceSubarrays();

        assertThat(solution.numberOfSubarrays_3(new int[]{1,1,2,1,1}, 3), is(2));
        assertThat(solution.numberOfSubarrays_3(new int[]{2,4,6}, 1), is(0));
        assertThat(solution.numberOfSubarrays_3(new int[]{2,2,2,1,2,2,1,2,2,2}, 2), is(16));
    }
}
