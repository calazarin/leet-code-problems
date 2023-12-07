package com.lazarin.practicing.leetcode.bitmanipulation.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link SingleNumber}
 */
public class SingleNumberTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        SingleNumber solution = new SingleNumber();
        assertThat(solution.singleNumber(new int[]{2,2,1}), is(1));
        assertThat(solution.singleNumber(new int[]{4,1,2,1,2}), is(4));
        assertThat(solution.singleNumber(new int[]{1}), is(1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        SingleNumber solution = new SingleNumber();
        assertThat(solution.singleNumber_2(new int[]{2,2,1}), is(1));
        assertThat(solution.singleNumber_2(new int[]{4,1,2,1,2}), is(4));
        assertThat(solution.singleNumber_2(new int[]{1}), is(1));
    }
}
