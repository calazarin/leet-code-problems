package com.lazarin.practicing.leetcode.intervals.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link NonOverlappingIntervals}
 */
public class NonOverlappingIntervalsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        NonOverlappingIntervals solution = new NonOverlappingIntervals();

        assertThat(solution.eraseOverlapIntervals(new int[][]{ {1,2}, {2,3}, {3,4}, {1,3}}), is(1));

        assertThat(solution.eraseOverlapIntervals(new int[][]{ {1,2}, {1,2}, {1,2}}), is(2));

        assertThat(solution.eraseOverlapIntervals(new int[][]{ {1,2}, {2,3}}), is(0));

        assertThat(solution.eraseOverlapIntervals(new int[][]{ {1,100}, {11,22}, {1,11}, {2,12}}), is(2));

    }
}
