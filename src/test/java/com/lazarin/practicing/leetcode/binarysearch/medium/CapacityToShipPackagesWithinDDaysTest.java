package com.lazarin.practicing.leetcode.binarysearch.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link CapacityToShipPackagesWithinDDays}
 */
public class CapacityToShipPackagesWithinDDaysTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        CapacityToShipPackagesWithinDDays solution = new CapacityToShipPackagesWithinDDays();
        assertThat(solution.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5), is(15));
        assertThat(solution.shipWithinDays(new int[]{3,2,2,4,1,4}, 3),is(6));
        assertThat(solution.shipWithinDays(new int[]{1,2,3,1,1}, 4),is(3));
    }
}
