package com.lazarin.practicing.leetcode.dynamicprogramming.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link DivisorGame}
 */
public class DivisorGameTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        DivisorGame solution = new DivisorGame();

        assertThat(solution.divisorGame(2), is(true));
        assertThat(solution.divisorGame(3), is(false));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        DivisorGame solution = new DivisorGame();

        assertThat(solution.divisorGame_2(2), is(true));
        assertThat(solution.divisorGame_2(3), is(false));
    }
}
