package com.lazarin.practicing.leetcode.intervals.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link MergeIntervals}
 */
public class MergeIntervalTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        MergeIntervals solution = new MergeIntervals();
        assertThat(solution.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}),
                is(new int[][]{{1,6},{8,10},{15,18}}));

        assertThat(solution.merge(new int[][]{{1,4}, {4,5}}), is(new int[][]{{1,5}}));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        MergeIntervals solution = new MergeIntervals();

        assertThat(solution.merge2(new int[][]{{1,3},{2,6},{8,10},{15,18}}),
                is(new int[][]{{1,6},{8,10},{15,18}}));

        assertThat(solution.merge2(new int[][]{{1,4}, {4,5}}), is(new int[][]{{1,5}}));

    }
}
