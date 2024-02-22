package com.lazarin.practicing.leetcode.greedy.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LargestNumberTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        LargestNumber solution = new LargestNumber();
        assertThat(solution.largestNumber(new int[]{10,2}), is("210"));
        assertThat(solution.largestNumber(new int[]{3,30,34,5,9}), is("9534330"));
    }
}
