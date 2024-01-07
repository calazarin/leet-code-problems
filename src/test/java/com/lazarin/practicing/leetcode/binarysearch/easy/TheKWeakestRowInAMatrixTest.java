package com.lazarin.practicing.leetcode.binarysearch.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link TheKWeakestRowInAMatrix}
 */
public class TheKWeakestRowInAMatrixTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        TheKWeakestRowInAMatrix solution = new TheKWeakestRowInAMatrix();

        assertThat(solution.kWeakestRows(new int[][]{
            {1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}
        },3), is(new int[]{2,0,3}));

        assertThat(solution.kWeakestRows(new int[][]{
                {1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}
        },2), is(new int[]{0,2}));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        TheKWeakestRowInAMatrix solution = new TheKWeakestRowInAMatrix();

        assertThat(solution.kWeakestRows_2(new int[][]{
                {1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}
        },3), is(new int[]{2,0,3}));

        assertThat(solution.kWeakestRows_2(new int[][]{
                {1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}
        },2), is(new int[]{0,2}));
    }
}
