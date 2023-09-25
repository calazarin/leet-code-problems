package com.lazarin.practicing.leetcode.bitmanipulation.easy;

import com.lazarin.practicing.leetcode.dynamicprogramming.medium.WordBreak;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link HammingDistance}
 */
public class HammingDistanceTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        HammingDistance solution = new HammingDistance();

        assertThat(solution.hammingDistance(1, 4), is(2));
        assertThat(solution.hammingDistance(3, 1), is(1));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        HammingDistance solution = new HammingDistance();

        assertThat(solution.hammingDistance2(1, 4), is(2));
        assertThat(solution.hammingDistance2(3, 1), is(1));

    }
}
