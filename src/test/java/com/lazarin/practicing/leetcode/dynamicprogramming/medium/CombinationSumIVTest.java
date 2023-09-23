package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link CombinationSumIV}
 */
public class CombinationSumIVTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        CombinationSumIV solution = new CombinationSumIV();

        assertThat(solution.combinationSum4(new int[]{1,2,3}, 4), is(7));
        assertThat(solution.combinationSum4(new int[]{9}, 3), is(0));
        assertThat(solution.combinationSum4(new int[]{4,2,1}, 32), is(39882198));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        CombinationSumIV solution = new CombinationSumIV();

        assertThat(solution.combinationSum4_2(new int[]{1,2,3}, 4), is(7));
        assertThat(solution.combinationSum4_2(new int[]{9}, 3), is(0));
        assertThat(solution.combinationSum4_2(new int[]{4,2,1}, 32), is(39882198));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3(){

        CombinationSumIV solution = new CombinationSumIV();

        assertThat(solution.combinationSum4_3(new int[]{1,2,3}, 4), is(7));
        assertThat(solution.combinationSum4_3(new int[]{9}, 3), is(0));
        assertThat(solution.combinationSum4_3(new int[]{4,2,1}, 32), is(39882198));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach4(){

        CombinationSumIV solution = new CombinationSumIV();

        assertThat(solution.combinationSum4_4(new int[]{1,2,3}, 4), is(7));
        assertThat(solution.combinationSum4_4(new int[]{9}, 3), is(0));
        assertThat(solution.combinationSum4_4(new int[]{4,2,1}, 32), is(39882198));
    }
}
