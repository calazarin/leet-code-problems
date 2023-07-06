package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link EqualRowAndColumnPairs}
 */
public class EqualRowAndColumnPairsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        EqualRowAndColumnPairs solution = new EqualRowAndColumnPairs();

        assertThat(solution.equalPairs(new int[][]{{3,2,1},{1,7,6}, {2,7,7}}), is(1));
        assertThat(solution.equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}), is(3));
        assertThat(solution.equalPairs(new int[][]{{3,1,2,2},{1,4,4,4},{2,4,2,2},{2,5,2,2}}), is(3));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        EqualRowAndColumnPairs solution = new EqualRowAndColumnPairs();

        assertThat(solution.equalPairs2(new int[][]{{3,2,1},{1,7,6}, {2,7,7}}), is(1));
        assertThat(solution.equalPairs2(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}), is(3));
        assertThat(solution.equalPairs2(new int[][]{{3,1,2,2},{1,4,4,4},{2,4,2,2},{2,5,2,2}}), is(3));

    }
}
