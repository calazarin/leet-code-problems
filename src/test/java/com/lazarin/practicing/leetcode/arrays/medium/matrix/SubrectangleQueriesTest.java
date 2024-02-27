package com.lazarin.practicing.leetcode.arrays.medium.matrix;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link SubrectangleQueries}
 */
public class SubrectangleQueriesTest {

    @Test
    public void shouldReturnExpectedAnswers_testCase1() {

        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(
                new int[][]{{1,2,1},{4,3,4},{3,2,1},{1,1,1}});

        assertThat(subrectangleQueries.getValue(0,2), is(1));
        subrectangleQueries.updateSubrectangle(0,0,3,2,5);
        assertThat(subrectangleQueries.getValue(0,2), is(5));
        assertThat(subrectangleQueries.getValue(3,1), is(5));
        subrectangleQueries.updateSubrectangle(3,0,3,2,10);
        assertThat(subrectangleQueries.getValue(3,1), is(10));
        assertThat(subrectangleQueries.getValue(0,2), is(5));
    }

    @Test
    public void shouldReturnExpectedAnswers_testCase2() {

        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(
                new int[][]{{1,1,1},{2,2,2},{3,3,3}});

        assertThat(subrectangleQueries.getValue(0,0), is(1));
        subrectangleQueries.updateSubrectangle(0,0,2,2,100);
        assertThat(subrectangleQueries.getValue(0,0), is(100));
        assertThat(subrectangleQueries.getValue(2,2), is(100));
        subrectangleQueries.updateSubrectangle(1,1,2,2,20);
        assertThat(subrectangleQueries.getValue(2,2), is(20));
    }

}
