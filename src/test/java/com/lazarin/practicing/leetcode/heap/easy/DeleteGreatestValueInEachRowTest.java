package com.lazarin.practicing.leetcode.heap.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link DeleteGreatestValueInEachRow}
 */
public class DeleteGreatestValueInEachRowTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        DeleteGreatestValueInEachRow solution = new DeleteGreatestValueInEachRow();
        assertThat(solution.deleteGreatestValue(new int[][]{{1,2,4}, {3,3,1}}), is(8));
        assertThat(solution.deleteGreatestValue(new int[][]{{10}}), is(10));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        DeleteGreatestValueInEachRow solution = new DeleteGreatestValueInEachRow();
        assertThat(solution.deleteGreatestValue_2(new int[][]{{1,2,4}, {3,3,1}}), is(8));
        assertThat(solution.deleteGreatestValue_2(new int[][]{{10}}), is(10));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3() {

        DeleteGreatestValueInEachRow solution = new DeleteGreatestValueInEachRow();
        assertThat(solution.deleteGreatestValue_3(new int[][]{{1,2,4}, {3,3,1}}), is(8));
        assertThat(solution.deleteGreatestValue_3(new int[][]{{10}}), is(10));
    }
}
