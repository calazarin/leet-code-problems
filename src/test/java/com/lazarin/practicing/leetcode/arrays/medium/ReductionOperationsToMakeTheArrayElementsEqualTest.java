package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 *{@link ReductionOperationsToMakeTheArrayElementsEqual}
 */
public class ReductionOperationsToMakeTheArrayElementsEqualTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        ReductionOperationsToMakeTheArrayElementsEqual solution = new ReductionOperationsToMakeTheArrayElementsEqual();
        assertThat(solution.reductionOperations_2(new int[]{5,1,3}), is(3));
        assertThat(solution.reductionOperations_2(new int[]{1,1,1}), is(0));
        assertThat(solution.reductionOperations_2(new int[]{1,1,2,2,3}), is(4));
    }
}
