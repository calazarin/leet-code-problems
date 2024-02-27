package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link QueriesOnNumberOfPointsInsideACircle}
 */
public class QueriesOnNumberOfPointsInsideACircleTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        QueriesOnNumberOfPointsInsideACircle
                solution = new QueriesOnNumberOfPointsInsideACircle();

        assertThat(solution.countPoints(new int[][]{{1,3},{3,3},{5,3}, {2,2}},
                new int[][]{{2,3,1}, {4,3,1}, {1,1,2}}), is(new int[]{3,2,2}));

        assertThat(solution.countPoints(new int[][]{{1,1},{2,2},{3,3},{4,4},{5,5}},
                new int[][]{{1,2,2},{2,2,2},{4,3,2},{4,3,3}}), is(new int[]{2,3,2,4}));

    }

}
