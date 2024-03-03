package com.lazarin.practicing.leetcode.twopointers.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link PartitionArrayAccordingToGivenPivot}
 */
public class PartitionArrayAccordingToGivenPivotTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        PartitionArrayAccordingToGivenPivot solution = new PartitionArrayAccordingToGivenPivot();

        assertThat(solution.pivotArray(new int[]{9,12,5,10,14,3,10}, 10), is(new int[]{9,5,3,10,10,12,14}));
        assertThat(solution.pivotArray(new int[]{-3,4,3,2}, 2), is(new int[]{-3,2,4,3}));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        PartitionArrayAccordingToGivenPivot solution = new PartitionArrayAccordingToGivenPivot();

        assertThat(solution.pivotArray_2(new int[]{9,12,5,10,14,3,10}, 10), is(new int[]{9,5,3,10,10,12,14}));
        assertThat(solution.pivotArray_2(new int[]{-3,4,3,2}, 2), is(new int[]{-3,2,4,3}));
    }
}
