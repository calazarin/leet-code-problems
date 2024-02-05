package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link LetterTilePossibilities}
 */
public class LetterTilePossibilitiesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        LetterTilePossibilities solution = new LetterTilePossibilities();
        assertThat(solution.numTilePossibilities("AAB"), is(8));
        assertThat(solution.numTilePossibilities("AAABBC"), is(188));
        assertThat(solution.numTilePossibilities("V"), is(1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        LetterTilePossibilities solution = new LetterTilePossibilities();
        assertThat(solution.numTilePossibilities_2("AAB"), is(8));
        assertThat(solution.numTilePossibilities_2("AAABBC"), is(188));
        assertThat(solution.numTilePossibilities_2("V"), is(1));
    }
}
