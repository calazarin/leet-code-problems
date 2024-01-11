package com.lazarin.practicing.leetcode.slidingwindow.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ContainsDuplicate2}
 */
public class ContainsDuplicate2Test {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        ContainsDuplicate2 solution = new ContainsDuplicate2();

        assertThat(solution.containsNearbyDuplicate(new int[]{1,2,3,1}, 3), is(true));
        assertThat(solution.containsNearbyDuplicate(new int[]{1,0,1,1}, 1), is(true));
        assertThat(solution.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2), is(false));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        ContainsDuplicate2 solution = new ContainsDuplicate2();

        assertThat(solution.containsNearbyDuplicate2(new int[]{1,2,3,1}, 3), is(true));
        assertThat(solution.containsNearbyDuplicate2(new int[]{1,0,1,1}, 1), is(true));
        assertThat(solution.containsNearbyDuplicate2(new int[]{1,2,3,1,2,3}, 2), is(false));
    }
}
