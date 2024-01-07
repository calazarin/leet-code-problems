package com.lazarin.practicing.leetcode.binarysearch.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link FindTargetIndicesAfterSortingArray}
 */
public class FindTargetIndicesAfterSortingArrayTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        FindTargetIndicesAfterSortingArray solution = new FindTargetIndicesAfterSortingArray();
        assertThat(solution.targetIndices_2(new int[]{1,2,5,2,3}, 2), is(Arrays.asList(1,2)));
        assertThat(solution.targetIndices_2(new int[]{1,2,5,2,3}, 3), is(Arrays.asList(3)));
        assertThat(solution.targetIndices_2(new int[]{1,2,5,2,3}, 5), is(Arrays.asList(4)));
    }
}