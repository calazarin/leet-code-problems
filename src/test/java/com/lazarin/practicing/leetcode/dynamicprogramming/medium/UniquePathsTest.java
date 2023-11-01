package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link UniquePaths}
 */
public class UniquePathsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        UniquePaths solution = new UniquePaths();

        assertThat(solution.uniquePaths_1(3, 7), is(28));
        assertThat(solution.uniquePaths_1(3, 2), is(3));
        assertThat(solution.uniquePaths_1(23, 12), is(193536720));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        UniquePaths solution = new UniquePaths();

        assertThat(solution.uniquePaths_2(3, 7), is(28));
        assertThat(solution.uniquePaths_2(3, 2), is(3));
        assertThat(solution.uniquePaths_2(23, 12), is(193536720));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3(){
        UniquePaths solution = new UniquePaths();

        assertThat(solution.uniquePaths_3(3, 7), is(28));
        assertThat(solution.uniquePaths_3(3, 2), is(3));
        assertThat(solution.uniquePaths_3(23, 12), is(193536720));
    }
}
