package com.lazarin.practicing.leetcode.slidingwindow.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MinimumRecolorsToGetKConsecutiveBlackBlocksTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MinimumRecolorsToGetKConsecutiveBlackBlocks solution = new MinimumRecolorsToGetKConsecutiveBlackBlocks();

        assertThat(solution.minimumRecolors("WBBWWBBWBW", 7), is(3));
        assertThat(solution.minimumRecolors("WBWBBBW", 2), is(0));
        assertThat(solution.minimumRecolors("BWWWBB", 6), is(3));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        MinimumRecolorsToGetKConsecutiveBlackBlocks solution = new MinimumRecolorsToGetKConsecutiveBlackBlocks();

        assertThat(solution.minimumRecolors_2("WBBWWBBWBW", 7), is(3));
        assertThat(solution.minimumRecolors_2("WBWBBBW", 2), is(0));
        assertThat(solution.minimumRecolors("BWWWBB", 6), is(3));
    }
}
