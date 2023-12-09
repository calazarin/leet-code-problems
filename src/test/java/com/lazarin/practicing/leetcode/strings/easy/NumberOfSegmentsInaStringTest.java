package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link NumberOfSegmentsInaString}
 */
public class NumberOfSegmentsInaStringTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        NumberOfSegmentsInaString solution = new NumberOfSegmentsInaString();
        assertThat(solution.countSegments("Hello, my name is John"), is(5));
        assertThat(solution.countSegments("Hello"), is(1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        NumberOfSegmentsInaString solution = new NumberOfSegmentsInaString();
        assertThat(solution.countSegments_2("Hello, my name is John"), is(5));
        assertThat(solution.countSegments_2("Hello"), is(1));
    }
}
