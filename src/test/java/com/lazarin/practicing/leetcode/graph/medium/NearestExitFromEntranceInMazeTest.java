package com.lazarin.practicing.leetcode.graph.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link NearestExitFromEntranceInMaze}
 */
public class NearestExitFromEntranceInMazeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        NearestExitFromEntranceInMaze solution = new NearestExitFromEntranceInMaze();

        char[][] input1 = new char[][]{
                {'+', '+', '.', '+'},
                {'.', '.', '.', '+'},
                {'+', '+', '+', '.'}
        };
        assertThat(solution.nearestExit(input1, new int[]{1, 2}), is(1));

        char[][] input2 = new char[][]{
                {'+', '+', '+'},
                {'.', '.', '.'},
                {'+', '+', '+'}
        };
        assertThat(solution.nearestExit(input2, new int[]{1, 0}), is(2));

        char[][] input3 = new char[][]{
                {'.', '+'}
        };
        assertThat(solution.nearestExit(input3, new int[]{0, 0}), is(-1));

        char[][] input4 = new char[][]{
            {'+', '.', '+', '+', '+', '+', '+'},
            {'+', '.', '+', '.', '.', '.', '+'},
            {'+', '.', '+', '.', '+', '.', '+'},
            {'+', '.', '.', '.', '.', '.', '+'},
            {'+', '+', '+', '+', '.', '+', '.'}
        };

        assertThat(solution.nearestExit(input4, new int[]{0, 1}), is(7));
    }

}
