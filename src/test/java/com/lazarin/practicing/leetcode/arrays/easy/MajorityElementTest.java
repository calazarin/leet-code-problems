package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MajorityElement}
 */
public class MajorityElementTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MajorityElement solution = new MajorityElement();
        assertThat(solution.majorityElement(new int[]{3,2,3}), is(3));
        assertThat(solution.majorityElement(new int[]{2,2,1,1,1,2,2}), is(2));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        MajorityElement solution = new MajorityElement();
        assertThat(solution.majorityElement2(new int[]{3,2,3}), is(3));
        assertThat(solution.majorityElement2(new int[]{2,2,1,1,1,2,2}), is(2));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3() {

        MajorityElement solution = new MajorityElement();
        assertThat(solution.majorityElement3(new int[]{3,2,3}), is(3));
        assertThat(solution.majorityElement3(new int[]{2,2,1,1,1,2,2}), is(2));
    }

}
