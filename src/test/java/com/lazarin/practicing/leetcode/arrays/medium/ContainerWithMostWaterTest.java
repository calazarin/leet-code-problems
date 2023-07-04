package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link ContainerWithMostWater}
 */
public class ContainerWithMostWaterTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        ContainerWithMostWater solution = new ContainerWithMostWater();
        assertThat(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}), is(49));
        assertThat(solution.maxArea(new int[]{1,1}), is(1));
        assertThat(solution.maxArea(new int[]{1,2, 1}), is(2));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        ContainerWithMostWater solution = new ContainerWithMostWater();
        assertThat(solution.maxArea2(new int[]{1,8,6,2,5,4,8,3,7}), is(49));
        assertThat(solution.maxArea2(new int[]{1,1}), is(1));
        assertThat(solution.maxArea2(new int[]{1,2, 1}), is(2));
    }
}
