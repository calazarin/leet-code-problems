package com.lazarin.practicing.leetcode.intervals.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link InsertInterval}
 */
public class InsertIntervalTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        InsertInterval solution = new InsertInterval();
        assertThat(solution.insert(new int[][]{{1,3},{6,9}}, new int[]{2,5}),
                is(new int[][]{{1,5},{6,9}}));

        assertThat(solution.insert(new int[][]{{1,2},{3,5}, {6,7}, {8,10}, {12,16}},
                new int[]{4,8}), is(new int[][]{{1,2}, {3,10}, {12,16}}));

    }
}
