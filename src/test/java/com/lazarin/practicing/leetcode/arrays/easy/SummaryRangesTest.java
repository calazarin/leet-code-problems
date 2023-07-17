package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

/**
 * {@link SummaryRanges}
 */
public class SummaryRangesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        SummaryRanges solution = new SummaryRanges();

        /*Explanation: The ranges are:
                [0,2] --> "0->2"
                [4,5] --> "4->5"
                [7,7] --> "7"*/
        assertThat(solution.summaryRanges(new int[]{0,1,2,4,5,7}),hasItems("0->2","4->5","7"));

        /*Explanation: The ranges are:
                [0,0] --> "0"
                [2,4] --> "2->4"
                [6,6] --> "6"
                [8,9] --> "8->9"*/
        assertThat(solution.summaryRanges(new int[]{0,2,3,4,6,8,9}),hasItems("0","2->4","6","8->9"));
    }

}