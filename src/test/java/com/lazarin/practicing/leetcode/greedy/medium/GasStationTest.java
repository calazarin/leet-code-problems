package com.lazarin.practicing.leetcode.greedy.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link GasStation}
 */
public class GasStationTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        GasStation solution = new GasStation();
        assertThat(solution.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}), is(3));
        assertThat(solution.canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}), is(-1));
    }
}
