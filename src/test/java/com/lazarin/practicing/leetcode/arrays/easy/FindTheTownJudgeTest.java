package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link FindTheTownJudge}
 */
public class FindTheTownJudgeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        FindTheTownJudge solution = new FindTheTownJudge();

        assertThat(solution.findJudge(2, new int[][]{{1,2}}), is(2));
        assertThat(solution.findJudge(3, new int[][]{{1,3}, {2,3}}), is(3));
        assertThat(solution.findJudge(3, new int[][]{{1,3}, {2,3}, {3,1}}), is(-1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        FindTheTownJudge solution = new FindTheTownJudge();

        assertThat(solution.findJudge2(2, new int[][]{{1,2}}), is(2));
        assertThat(solution.findJudge2(3, new int[][]{{1,3}, {2,3}}), is(3));
        assertThat(solution.findJudge2(3, new int[][]{{1,3}, {2,3}, {3,1}}), is(-1));
    }
}
