package com.lazarin.practicing.leetcode.binarysearch.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link PeakIndexInaMountainArray}
 */
public class PeakIndexInaMountainArrayTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        PeakIndexInaMountainArray solution = new PeakIndexInaMountainArray();

        assertThat(solution.peakIndexInMountainArray(new int[]{0,1,0}),is(1));
        assertThat(solution.peakIndexInMountainArray(new int[]{0,2,1,0}),is(1));
        assertThat(solution.peakIndexInMountainArray(new int[]{0,10,5,2}),is(1));
        assertThat(solution.peakIndexInMountainArray(new int[]{3,5,3,2,0}), is(1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        PeakIndexInaMountainArray solution = new PeakIndexInaMountainArray();

        assertThat(solution.peakIndexInMountainArray_2(new int[]{0,1,0}),is(1));
        assertThat(solution.peakIndexInMountainArray_2(new int[]{0,2,1,0}),is(1));
        assertThat(solution.peakIndexInMountainArray_2(new int[]{0,10,5,2}),is(1));
        assertThat(solution.peakIndexInMountainArray_2(new int[]{3,5,3,2,0}), is(1));
    }
}
