package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MoveZeroes}
 */
public class MoveZeroesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MoveZeroes solution = new MoveZeroes();

        int[] input1 = new int[]{0, 0};
        solution.moveZeroes(input1);
        assertThat(input1, is(new int[]{0, 0}));

        int[] input2 = new int[]{1, 0};
        solution.moveZeroes(input2);
        assertThat(input2, is(new int[]{1, 0}));

        int[] input3 = new int[]{0,1,0,3,12};
        solution.moveZeroes(input3);
        assertThat(input3, is(new int[]{1,3,12,0,0}));

        int[] input4 = new int[]{0};
        solution.moveZeroes(input4);
        assertThat(input4, is(new int[]{0}));

    }
}