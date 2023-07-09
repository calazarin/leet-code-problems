package com.lazarin.practicing.leetcode.strings.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RemovingStarsFromStringTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        RemovingStarsFromString solution = new RemovingStarsFromString();

        assertThat(solution.removeStars("leet**cod*e"), is("lecoe"));
        assertThat(solution.removeStars("erase*****"), is(""));

    }
}
