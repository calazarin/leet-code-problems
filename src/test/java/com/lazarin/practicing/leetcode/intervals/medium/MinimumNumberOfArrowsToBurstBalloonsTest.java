package com.lazarin.practicing.leetcode.intervals.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link MinimumNumberOfArrowsToBurstBalloons}
 */
public class MinimumNumberOfArrowsToBurstBalloonsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        MinimumNumberOfArrowsToBurstBalloons solution = new MinimumNumberOfArrowsToBurstBalloons();

        assertThat(solution.findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}), is(2));
        assertThat(solution.findMinArrowShots(new int[][]{{1,2},{3,4},{5,6},{7,8}}), is(4));
        assertThat(solution.findMinArrowShots(new int[][]{{1,2},{2,3},{3,4},{4,5 }}), is(2));

    }

}
