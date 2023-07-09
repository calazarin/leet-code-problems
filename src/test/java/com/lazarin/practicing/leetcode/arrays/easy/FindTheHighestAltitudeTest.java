package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link FindTheHighestAltitude}
 */
public class FindTheHighestAltitudeTest{

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        FindTheHighestAltitude solution =
                new FindTheHighestAltitude();

        assertThat(solution.largestAltitude(new int[]{-5,1,5,0,-7}), is(1));
        assertThat(solution.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}), is(0));
    }
}
