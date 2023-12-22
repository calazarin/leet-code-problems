package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link IntersectionOfTwoArrays}
 */
public class IntersectionOfTwoArraysTest{

        @Test
        public void shouldReturnExpectedAnswers_approach1() {

            IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();

            assertThat(solution.intersection(new int[]{1,2,2,1}, new int[]{2,2}),
                    is(new int[]{2}));
            assertThat(solution.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4}),
                    is(new int[]{9,4}));
        }

}
