package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class IslandPerimeterTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        IslandPerimeter solution = new IslandPerimeter();

        assertThat(solution.islandPerimeter(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0}, {1,1,0,0}}), is(16));
        assertThat(solution.islandPerimeter(new int[][]{{1}}), is(4));
        assertThat(solution.islandPerimeter(new int[][]{{0,1}}), is(4));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        IslandPerimeter solution = new IslandPerimeter();

        assertThat(solution.islandPerimeter2(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0}, {1,1,0,0}}), is(16));
        assertThat(solution.islandPerimeter2(new int[][]{{1}}), is(4));
        assertThat(solution.islandPerimeter2(new int[][]{{0,1}}), is(4));
    }
}
