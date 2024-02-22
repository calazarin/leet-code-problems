package com.lazarin.practicing.leetcode.greedy.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link MaximumUnitsOnATruck}
 */
public class MaximumUnitsOnATruckTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        MaximumUnitsOnATruck solution = new MaximumUnitsOnATruck();
        assertThat(solution.maximumUnits(new int[][]{{1,3},{2,2},{3,1}}, 4), is(8));
        assertThat(solution.maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}}, 10), is(91));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        MaximumUnitsOnATruck solution = new MaximumUnitsOnATruck();
        assertThat(solution.maximumUnits_2(new int[][]{{1,3},{2,2},{3,1}}, 4), is(8));
        assertThat(solution.maximumUnits_2(new int[][]{{5,10},{2,5},{4,7},{3,9}}, 10), is(91));
    }
}
